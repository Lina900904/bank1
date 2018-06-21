package serviceImpl;

import java.lang.reflect.Member;
import java.util.Map;
import java.util.HashMap;

import domain.*;
import service.*;

public class MemberServiceImpl2 implements MemberService2 {
	Map<String, MemberBean> map;

	public MemberServiceImpl2() {
		map = new HashMap<>();
	}

	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
		map.put(user.getUid(), user);
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		map.put(staff.getUid(), staff);
	}

	@Override
	public Map<String, MemberBean> map() {
		return map;
	}

	@Override
	public Map<String, MemberBean> findByName(String param) {
		Map<String, MemberBean> temp = new HashMap<>();
		System.out.println("");
		int sameName =0;
		/*for(int i =0; i<list.size();i++) {
			if(param.equals(list.get(i).getName())) {
			temp.add(list.get(i));
			sameName++;
			}
		}
			for(int i =0; i<list.size();i++) {
				if(param.equals(list.get(i).getName())) {
				temp.add(list.get(i));
				if((sameName+1)==temp.size())break;*/
	/*	
		for(MemberBean e :list) {
			if(param.equals(e.getName())) {
			temp.add(e);
			sameName++;
			}
		}
			for(MemberBean e :list) {
				if(param.equals(e.getName())) {
				temp.add(e);
				if((sameName+1)==temp.size())break;
				}*/
		return temp;
	}

	@Override
	public MemberBean findById(MemberBean member) {
		System.out.println("찾는 아이디에 해당하는이름" + map.get(member.getUid()));
		return map.get(member.getUid());
	}

	@Override
	public void updatPass(MemberBean member) {
		/*
		 * String id = member.getUid(); String oldPass= member.getPass().split("/")[0];
		 * String newPass= member.getPass().split("/")[1]; MemberBean serch=
		 * map.get(member.getUid()); serch.setPass(newPass);
		 */
		String id = member.getUid();
		String oldPass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		MemberBean serch = map.get(member.getUid());
		if (serch == null) {
			System.out.println("수정하려는 ID가 없음");
		} else {
			if (oldPass.equals(serch.getPass())) {
				System.out.println("수정하려는 id가 없음");
			}
		}
		if (oldPass.equals(serch.getPass())) {
			serch.setPass(newPass);
			map.put(id, serch);
		}
	}

	@Override
	public void deldteMember(MemberBean member) {
		map.remove(findById(member));
	}

}