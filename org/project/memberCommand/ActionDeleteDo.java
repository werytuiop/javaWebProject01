package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionDeleteDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# ȸ�� Ż�� #");

		MemberDao dao = new MemberDao();
		int rs = dao.deleteDo();
		System.out.println("return�� : " + rs);
		System.out.println();
	}

}
