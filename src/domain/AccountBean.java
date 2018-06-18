package domain;

import serviceImpl.*;

public class AccountBean {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, createDate, accountType, accountNum;
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountNo(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public String getUid() {
		return uid;
	}

	public String getPass() {
		return pass;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNo() {
		return accountNum;
	}

	public String toString( ) {
		return String.format("%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %s 원 ", BANK_NAME,
				ACCOUNT_TYPE, accountNum, name, createDate, money);
	
	}
}