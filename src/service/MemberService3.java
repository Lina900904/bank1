package service;

import java.util.List;
import java.util.Map;

import domain.*;

public interface MemberService3 {
	public void createUser(UserBean user);
	public void createStaff(StaffBean staff);
	public Map<String,MemberBean> map();
	public List<MemberBean> findByName(String param);
	public MemberBean findById(MemberBean member);
	public void updatPass(MemberBean member);
	public void deldteMember(MemberBean member);
	
	

}
