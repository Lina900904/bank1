package service;

import java.util.List;

import domain.*;

public interface MemberService {
	public void createUser(UserBean user);
	public void createStaff(StaffBean staff);
	public List<MemberBean> list();
	public List<MemberBean> serch(String param);
	public MemberBean serch(MemberBean param);
	public void updat(MemberBean member);
	public void deldte(MemberBean member);
	
	

}
