package serviceImpl;

import domain.*;
import service.*;

public class MemberServiceImpl implements MemberService {
	
	MemberBean[] list;
	int count;
	public MemberServiceImpl() {
		count =0;
		list=new MemberBean[10];
	}

	@Override
	public void crateJoin(MemberBean user) {
		((UserBean) user).setCreditRating("7등급");
		System.out.println(user.getName());
		addList(user);
	}

	@Override
	public MemberBean[] list() {

		return list;
	}

	@Override
	public void addList(MemberBean member) {
		list[count++] = member;
		System.out.println(member.getName());
	}

	@Override
	public void crateStaffJoin(MemberBean staff) {
		((StaffBean)staff).setAccessNum("1234");
		
			

	}

	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean acc = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (member.getUid().equals(list[i].getUid()) && member.getPass().equals(list[i].getUid())) {
				acc = list[i];
				break;
			}
		}
		return acc;
	}

	@Override
	public MemberBean[] findByName(String name) {

		MemberBean[] arr = new MemberBean[0];
		int cn = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(list[i].getName())) {
				arr[cn] = list[i];
				cn++;
			} else {
				break;
			}

		}

		return null;
	}

	@Override
	public int countWord(String name) {
		int temp = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(list[i].getName())) {
				temp++;
			}
		}
		return temp;
	}

	@Override
	public String count() {

		return String.valueOf(count);
	}

	@Override
	public Object update(MemberBean member) {
		String result = "";
		String pass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		for (int i = 0; i < count; i++) {
			if (member.getPass().equals(pass)) {
				member.setPass(newPass);
				result = "비밀번호 변경 성공";
			} else {
				result = "아이디or비밀번호 불일치";
			}
		}
		return newPass;

	}
	
	
}
