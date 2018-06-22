package dao;

import java.util.List;

import domain.*;

public interface MemberDAO   {
		public void insertMember(MemberBean member);
		public List<MemberBean>  selectMemberList();
		public List<MemberBean> selectAccountList();
		public MemberBean selectMemberById(String id);
		public MemberBean login(MemberBean member);
		public int countMembers();
		public void updateMember(MemberBean member);
		public void delete(MemberBean member);
	
		
}
