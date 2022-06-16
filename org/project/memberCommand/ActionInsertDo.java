package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionInsertDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# 회원 가입 #");

		MemberDao dao = new MemberDao();
		int rs = dao.insertDo();
		System.out.println("return값 : " + rs);
		System.out.println();
	}

}
