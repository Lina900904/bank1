package domain;

import java.text.*;
import java.util.*;
import service.AccountService;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money, deposit, withdraw;
	protected String uid, name, pass, accountType, createDate, accountNo;



	public Account() {
		setAccountType(ACCOUNT_TYPE);
		setCreateDate();
		setAccountNo();
		this.name = name.substring(0, 1);
		this.uid = uid;
		this.pass = pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setDeposit(int deposit) {
		this.deposit = money+deposit;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = money-withdraw;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCreateDate() {
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		this.createDate = df.format(now);
	}

	public void setAccountNo() {
		String accountNum = "";
				for(int i =0; i<3; i ++) {
					if(i==2) {
						accountNum+= String.format("%03d",(int)(Math.random()*1000))+" ";
					}else {
						accountNum+= String.format("%03d",(int)(Math.random()*1000))+"-";
					}
				}
				this.accountNo=accountNum;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public int getMoney() {
		return money;
	}

	public int getDeposit() {
		return deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public String getCreatDate() {
		return createDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String toString() {
		return String.format("%s\n %s\n 계좌번호:%s\n 이름:%s\n 생성일:%s\n 잔액: %d원 \n", BANK_NAME, ACCOUNT_TYPE, getAccountNo(),
				getName(), getCreatDate(), getMoney());

	}

}
