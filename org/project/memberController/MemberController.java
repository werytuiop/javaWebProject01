package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommand.ActionDeleteDo;
import org.project.memberCommand.ActionInsertDo;
import org.project.memberCommand.ActionSelectDo;
import org.project.memberCommand.ActionUpdateDo;
import org.project.memberCommand.ActionCommand;

public class MemberController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		ActionCommand command = null; // �������� ���� ���� ���� �ʱ�ȭ

		while (true) {

			System.out.println("> �������� �Է��ϼ���.\n(insert/select/update/delete)");
			String query = scn.next();

			if (query.equals("insert")) {
				command = new ActionInsertDo(); // ������
				command.excuteQuery();
			} else if (query.equals("update")) {
				command = new ActionUpdateDo();
				command.excuteQuery();
			} else if (query.equals("delete")) {
				command = new ActionDeleteDo();
				command.excuteQuery();
			} else if (query.equals("select")) {
				command = new ActionSelectDo();
				command.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.\n");
			}

		}

		scn.close();

	}

}
