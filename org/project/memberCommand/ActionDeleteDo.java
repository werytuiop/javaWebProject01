package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionDeleteDo extends ActionCommand {

	@Override
	public void excuteQuery() {
		System.out.println("# È¸¿ø Å»Åð #");

		MemberDao dao = new MemberDao();
		int rs = dao.deleteDo();
		System.out.println("return°ª : " + rs);
		System.out.println();
	}

}
