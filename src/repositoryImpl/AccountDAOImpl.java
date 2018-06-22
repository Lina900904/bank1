package repositoryImpl;

import java.util.List;

import dao.AccountDAO;
import domain.AccountBean;
import domain.MinusAccountBean;

public class AccountDAOImpl implements AccountDAO{
	private static AccountDAO instance = new AccountDAOImpl();
	public static AccountDAO getInstance() {return instance;}
	public static void setInstance(AccountDAO instance) {
		AccountDAOImpl.instance = instance;
	}
	public void accountDAOImpl() {}
		
	

	@Override
	public void insertAccount(AccountBean account) {
		System.out.println("Account DAO에서 넘어온객체 : "+account);
		
	}

	@Override
	public void insertMinus(MinusAccountBean MinusAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountBean> selectAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> selectMinusAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean selectAccountById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePass(AccountBean account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(AccountBean account) {
		// TODO Auto-generated method stub
		
	}

}
