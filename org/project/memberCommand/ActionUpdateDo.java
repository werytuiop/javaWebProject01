package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionUpdateDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# 회원 수정 #");

		MemberDao dao = new MemberDao();
		int rs = dao.updateDo();
		System.out.println("return값 : " + rs);
		System.out.println();
	}

}
