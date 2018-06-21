package serviceImpl;

import java.lang.reflect.Member;
import java.util.*;

import domain.*;
import service.*;

public class MemberServiceImpl1 implements MemberService1{
	List<MemberBean> list;
	Map<String, MemberBean> map;

	public MemberServiceImpl1() {
		list = new ArrayList<MemberBean>();
		map = new HashMap<String,MemberBean>();
	}

	@Override
	public void createUser(MemberBean user) {
		//user.setCreditRating("7등급");
		// boolean flag = list.add(user);
		System.out.println("실행결과:" + (list.add(user) ? "등록성공" : "등록실패"));
	}

	@Override
	public void createStaff(MemberBean staff) {
		//staff.setAccessNum("1234");
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
	public void update(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findById(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}