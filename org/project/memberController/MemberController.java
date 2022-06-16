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
		ActionCommand command = null; // 다형성을 위한 참조 변수 초기화

		while (true) {

			System.out.println("> 쿼리문을 입력하세요.\n(insert/select/update/delete)");
			String query = scn.next();

			if (query.equals("insert")) {
				command = new ActionInsertDo(); // 다형성
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
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.\n");
			}

		}

		scn.close();

	}

}
