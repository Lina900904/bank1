package service;

import java.util.*;

import domain.*;

public interface MemberService1 {
	public void createUser(MemberBean member);
	public void createStaff(MemberBean member);
	public List<MemberBean> findByName(String name);
	public Map<String,MemberBean> map();
	public void update(MemberBean member);
	public void delete(MemberBean member);
	public List<MemberBean> list();
	public MemberBean count();
	public void findById(MemberBean member);
	
	

}
