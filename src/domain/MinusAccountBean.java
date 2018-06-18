package domain;

import serviceImpl.*;

public class MinusAccountBean extends AccountBean{
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "마이너스 통장";
	protected String name, uid, pass, createDate, accountType, accountNum,limit, money;
	
	

	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getLimit() {
		return limit;
	}

	
	@Override
	public String toString( ) {
		return String.format("%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %s 원\n 한도 : %s 원 ", BANK_NAME,
				ACCOUNT_TYPE, super.getAccountNo(), super.getName(), super.getCreateDate(),super.getMoney(),getLimit());
	
	}
}
