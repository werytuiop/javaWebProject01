package org.project.memberCommand;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.MemberDto;

public class ActionSelectDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# ȸ�� ��ȸ #");

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.list();
		System.out.println(lists);
		System.out.println();
	}

}
