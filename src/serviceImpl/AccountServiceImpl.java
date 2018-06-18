package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	int count;
	AccountBean[] list;
	
public  AccountServiceImpl() {
	count =0;
	list=new AccountBean[100];
}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum(createRandom(0, 999)));
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		// account.setMoney(money); deposit 에서 처리
		addList(account);
	}

	@Override
	public AccountBean[] list() {
		return list;

	}

	@Override
	public void addList(AccountBean account) {
		list[count++] = account;
	}
	@Override
	public void createMinusAccount(AccountBean account) {
		account.setAccountNo(createAccountNum(createRandom(0, 999)));
		account.setAccountType(MinusAccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		
		// account.setMoney(money); deposit 에서 처리
		addList(account);
	}

	@Override
	public void addMinusList(MinusAccountBean account) {
		
		list[count++] = account;
		

	}
	@Override
	public MinusAccountBean[] mList() {
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
	public String createAccountNum(String Random) {
		String accountNum = "";
		for (int i = 0; i < 3; i++) {
			accountNum += (i != 2) ? String.format("%03d", Integer.parseInt(createRandom(1, 999))) + "-"
					: String.format("%03d", Integer.parseInt(createRandom(1, 999))) + "";
		}
		return accountNum;

	}

	@Override
	public String createRandom(int start, int end) {
		return String.valueOf((int) (Math.random() * (end + 1)) + start);
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}

	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean acc = new AccountBean();
		// 배열 list를 looping하면서
		// 아이디가 일치하고 비번이 일치한
		// 그 객체를 리턴한다
		// 일단 일치하는 값이 없는 상황은 나중에 처리
		for (int i = 0; i < count; i++) {
			if (account.getUid().equals(list[i].getUid()) && account.getPass().equals(list[i].getPass())) {
				acc = list[i];
				break;
			}
		}
		return acc;
	}

	@Override
	public int countSameWord(String word) {
		int temp = 0;
		for (int i = 0; i < count; i++) {
			if (word.equals(list[i].getName())) {
				temp++;
			} // 배열 개수를 만들 부분
		}
		return temp;
	}

	@Override
	public AccountBean[] findByName(String name) {
		int temp = countSameWord(name);
		AccountBean[] arr = new AccountBean[temp];
		int cn = 0;
		for (int i = 0; i < count; i++) { // 이름을 검색할 부분
			if (name.equals(list[i].getName())) {
				arr[cn] = list[i];
				cn++;
				if (cn == temp) { // if문을 나갈부분
					break;
				}
			}
		}
		return arr;
	}




	

	
}
