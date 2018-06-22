package service;

import java.util.List;
import java.util.Map;

import domain.*;

public interface MemberService {// list -> map으로 하는 예제
	public void createUser(UserBean member);
	public String login(StaffBean member);
	public void updatePass(MemberBean member);
	public void deleteMember(MemberBean member);
}
