package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import domain.*;
import service.AccountService2;

public class AccountServiceImpl2 implements AccountService2 {
	Map<String, AccountBean> map;

	public AccountServiceImpl2() {

		map = new HashMap<>();
	}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum());
		account.setCreateDate(createDate());
		map.put(account.getUid(), account);
	}

	@Override
	public Map<String, AccountBean> map() {

		return map;
	}

	@Override
	public AccountBean findById(AccountBean account) {

		return map.get(account.getUid());
	}

	@Override
	public void chagePass(AccountBean account) {

		String id = account.getUid();
		String oldPass = account.getPass().split("/")[0];
		String newPass = account.getPass().split("/")[1];
		AccountBean serch = map.get(account.getUid());
		if (serch == null) {
			System.out.println("찾는값 없음");
		} else {
		
			if (oldPass.equals(serch.getPass())) {
				serch.setPass(newPass);
				System.out.println("찾는값 있음");
				map.put(id, serch);
			}

		}
	}

	@Override
	public void deleteAccount(AccountBean account) {
		map.remove(findById(account));
	}

	@Override
	public String random(int start, int end) {
		String random = "";
		random = String.format("%03d", (int) (Math.random() * end) + start);
		return random;
	}

	@Override
	public String createAccountNum() {

		String accountNum = "";
		for (int i = 0; i < 3; i++) {
			accountNum += (i == 2) ? random(0, 999) : random(0, 999) + "-";
		}

		return accountNum;
	}

	@Override
	public String createDate() {

		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	@Override
	public Map<String, AccountBean> findByName(String name) {
		Map<String, AccountBean> map = new HashMap<>();
		for (int i = 0; i < map.size(); i++) {
			if (name.equals(map.get(i).getName())) {
				map.get(name);
				break;
			}
		}

		return map;
	}

}
