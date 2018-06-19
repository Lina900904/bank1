package service;

import domain.*;


public interface MemberService {
	 public void crateJoin(MemberBean user) ;
	 public MemberBean[] list();
	 public void crateStaffJoin(MemberBean staff);
	 public void addList(MemberBean member);
	public MemberBean findById(MemberBean member);
	public MemberBean[] findByName(String name);
	public int countWord(String name);
	 public String count();
	public  Object update(MemberBean member);
	
	 
	 
	
	
	
}
