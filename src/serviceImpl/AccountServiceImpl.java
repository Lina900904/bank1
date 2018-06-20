package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import domain.Account;
import domain.AccountBean;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	List<AccountBean> list;

	public AccountServiceImpl() {

		list = new ArrayList<AccountBean>();
	}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum());
		account.setCreateDate(createDate());
		list.add(account);
	}

	@Override
	public void createMinusAccount(AccountBean minusAccount) {
	}

	@Override
	public List<AccountBean> list() {

		return list;
	}

	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean id = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (account.getName().equals(list.get(i).getName())) {
				id = list.get(i);
				break;

			}

		}
		return id;
	}

	@Override
	public List<AccountBean> seachName(String name) {
		List<AccountBean> temp = new ArrayList<AccountBean>();
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getUid())) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}

	@Override
	public void chagePass(AccountBean account) {
		list.get(list.indexOf(findById(account))).setPass(account.getPass());
	}

	@Override
	public void deleteAccount(AccountBean account) {
		list.remove(findById(account));
	}

	@Override
	public String random(int start, int end) {
		String random ="";
		random = String.format("%03d", (int)(Math.random()*end )+start);
				return random;
	}
	
	

	@Override
	public String createAccountNum() {
	
		
		String accountNum="";
		for(int i =0; i<3;i++) {
			accountNum+=(i==2)?random(0,999):random(0,999)+"-";
		}
		
		return accountNum;
	}

	@Override
	public String createDate() {
	
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
	}



}
