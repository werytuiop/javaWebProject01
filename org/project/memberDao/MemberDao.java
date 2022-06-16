package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.MemberDto;

public class MemberDao {

	public MemberDao() {
		// 기본생성자
	}

	public int insertDo() {
		System.out.println("## 회원 가입 실행 ##");
		int rs = 0;
		return rs;
	}

	public int updateDo() {
		System.out.println("## 회원 수정 실행 ##");
		int rs = 0;
		return rs;
	}

	public int deleteDo() {
		System.out.println("## 회원 탈퇴 실행 ##");
		int rs = 0;
		return rs;
	}

	public ArrayList<MemberDto> list() {
		System.out.println("## 회원 조회 실행 ##");
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		return lists;
	}

}
