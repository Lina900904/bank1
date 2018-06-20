package service;

import java.util.*;

import domain.*;

public interface AccountService {
	public void createAccount(AccountBean account);
	public void createMinusAccount(AccountBean account);
	public List<AccountBean> list();
	public AccountBean findById(AccountBean account);
	public List<AccountBean> seachName(String id);
	public void chagePass(AccountBean account);
	public void deleteAccount(AccountBean account);
	public String random(int start, int end);
	public String createAccountNum();
	public String createDate();
}