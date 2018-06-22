package dao;

import java.util.List;

import domain.*;

public interface AccountDAO {
	public void insertAccount (AccountBean account);
	public void insertMinus(MinusAccountBean MinusAccount);
	public List<AccountBean> selectAccountList();
	public List<AccountBean> selectMinusAccountList();
	public AccountBean selectAccountById(String id);
	public void updatePass(AccountBean account);
	public void deleteAccount(AccountBean account);

}
