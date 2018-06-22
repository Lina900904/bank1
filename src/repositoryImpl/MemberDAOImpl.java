package repositoryImpl;

import java.util.List;

import dao.MemberDAO;
import domain.*;
public class MemberDAOImpl implements MemberDAO{
	private static MemberDAO instance=new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	public void MemberDAOImpl(){}
	


	@Override
	public void insertMember(MemberBean member) {
		System.out.println("Member DAO에서 넘어온객체 : "+member);
	}

	@Override
	public List<MemberBean> selectMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> selectAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}

	


