package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionInsertDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# ȸ�� ���� #");

		MemberDao dao = new MemberDao();
		int rs = dao.insertDo();
		System.out.println("return�� : " + rs);
		System.out.println();
	}

}
