package serviceImpl;

import domain.Account;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	Account[] list = new Account[10];

	@Override
	public Account createAccount(String name, String uid, String pass) {
		Account account = new Account(); // Account에 값을 넘겨주기 위해서
		account.setAccountNo(createAccountNum(createRandom(0,999)));
//		account.setAccountType(accountType); 구현불가
		account.setCreateDate(createDate());
//		account.setMoney(money); deposit 에서 처리
		account.setName(name);
		account.setPass(pass);
		account.setUid(uid);
		return account;
	}

	@Override
	public void addList(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deposit(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdarw(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		String random="";
		return random;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		
		return null;
	}

}
