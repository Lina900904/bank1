package service;

import java.util.*;

import domain.*;

public interface AccountService2 {
	public void createAccount(AccountBean account);
	public Map<String,AccountBean> map();
	public AccountBean findById(AccountBean account);
	public Map<String,AccountBean> findByName(String name);
	public void chagePass(AccountBean account);
	public void deleteAccount(AccountBean account);
	public String random(int start, int end);
	public String createAccountNum();
	public String createDate();
}