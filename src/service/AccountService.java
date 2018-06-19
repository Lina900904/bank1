package service;

import domain.AccountBean;
import domain.MinusAccountBean;

public interface AccountService   {
	public void createAccount(AccountBean account);
	public AccountBean[] list();
	public int deposit(String money);
	public int withdarw(String money);
	public String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public AccountBean findById(AccountBean account);
	public AccountBean[] findByName(String name);
	public int countSameWord(String word);
	void addList(AccountBean account);
	
	public void createMinusAccount(AccountBean account);
	void addMinusList(MinusAccountBean account);
	public MinusAccountBean[] mList();
	public String changePass(AccountBean account);
	public Object confirmPass(AccountBean account);
}
