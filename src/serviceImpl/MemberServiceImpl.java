package serviceImpl;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import domain.*;
import service.*;

public class MemberServiceImpl implements MemberService {
	List<MemberBean> list;

	public MemberServiceImpl() {
		list = new ArrayList<MemberBean>();
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
	public List<MemberBean> list() {
		return list;
	}

	@Override
	public List<MemberBean> serch(String param) {
	List<MemberBean> temp = new ArrayList<>();
	int sameName =0;
	for(int i =0; i<list.size();i++) {
		if(param.equals(list.get(i).getName())) {
		temp.add(list.get(i));
		sameName++;
		}
	}
		for(int i =0; i<list.size();i++) {
			if(param.equals(list.get(i).getName())) {
			temp.add(list.get(i));
			if((sameName+1)==temp.size())break;
			}
		}
		return null;
	}

	@Override
	public MemberBean serch(MemberBean param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updat(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deldte(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	

}