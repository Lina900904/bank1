package serviceImpl;

import java.util.*;
import domain.*;
import service.*;

public class AdminServiceImpl implements AdminService{
	private Map<String, MemberBean> accountTable;
	private Map<String, MemberBean> mamberTable;
	public  AdminServiceImpl() {
		accountTable = new HashMap<>();
		mamberTable = new HashMap<>();
	}
		
	
	public Map<String, MemberBean> accountList() {
		return accountTable;
	}
	
	public Map<String, MemberBean> memberList() {
		return mamberTable;
	}
	
}
