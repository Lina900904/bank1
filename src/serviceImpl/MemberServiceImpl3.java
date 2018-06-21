package serviceImpl;

import java.lang.reflect.Member;
import java.util.*;

import domain.*;
import service.*;

public class MemberServiceImpl3 implements MemberService3{
	List<MemberBean> list;
	Map<String, MemberBean> map;

	public MemberServiceImpl3() {
		list = new ArrayList<MemberBean>();
		map = new HashMap<String,MemberBean>();
	}

	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
		// boolean flag = list.add(user);
		System.out.println("실행결과:" + (list.add(user) ? "등록성공" : "등록실패"));
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		System.out.println("실행결과:" + (list.add(staff) ? "등록성공" : "등록실패"));
	}

	@Override
	public Map<String,MemberBean> map() {
		return map;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> temp = new ArrayList<>();
		Set<MemberBean> set = new HashSet<>();
		for (Map.Entry<String, MemberBean> e : map.entrySet()) {
			if (name.equals(e.getValue().getName())) {
				set.add(e.getValue());

			}
		}
		Iterator<MemberBean> it = set.iterator();
		while (it.hasNext()) {
			temp.add(it.next());

		}

		return temp;
	}


	@Override
	public MemberBean findById(MemberBean member) {
		System.out.println("찾는 아이디에 해당하는이름" + map.get(member.getUid()));
		return null;
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