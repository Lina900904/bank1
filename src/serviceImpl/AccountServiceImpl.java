package serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.*;
import repositoryImpl.AccountDAOImpl;
import service.*;

public class AccountServiceImpl implements AccountService{
	private static AccountService intstance = new AccountServiceImpl();
	public static AccountService getInstance() {return intstance;}
	private AccountServiceImpl() {list = new ArrayList<>();}
	private List<AccountBean> list;
		
	
	
	
	
	@Override
	public void createAccount(AccountBean account) {
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setCreateDate(AdminServiceImpl.getInstance().createDate());
		account.setAccountNo(AdminServiceImpl.getInstance().createAccountNo());
		System.out.println("====멤버 서비스===");
		System.out.println("컨트롤에서 넘어온객체"
				+account);
		
		
	
	}
	@Override
	public void createMinus(MinusAccountBean minusAccount) {
		minusAccount.setCreateDate("4321");
		minusAccount.setAccountType("마이너스통장");
		minusAccount.setAccountNo("1234");
		list.add(minusAccount);
	}
	@Override
	public AccountBean findAccountById(AccountBean account) {
		AccountBean temp = new AccountBean();
		String uid = account.getUid();
		String pass = account.getPass();
		temp = list.get(list.indexOf(account));
		if(temp == null) {
			System.out.println("null");
		}else if(!temp.getPass().equals(pass)) {
			System.out.println("패스가달라");
		}else {
			System.out.println("찾기완료");
		}
		return temp;
	}
	@Override
	public void updatePass(AccountBean account) {
		String id = account.getUid();
		String newPass = account.getPass().split("/")[1];
		account.setPass(account.getPass().split("/")[0]);
		AccountBean ab = findAccountById(account);
		if(ab == null) {
			System.out.println("없는 아이디입니다.");
		}else {
			ab.setPass(newPass);
		}
	}

	@Override
	public void deleteAccount(AccountBean account) {
		AccountBean ab = findAccountById(account);
		if(ab == null) {
			System.out.println("없는 아이디");
		}else {
			list.remove(list.indexOf(ab));
		}
	}
}
