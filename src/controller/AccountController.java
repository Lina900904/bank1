package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.*;
import serviceImpl.*;

public class AccountController {
	private static AccountController intance = new AccountController();
	public static AccountController getInstance() {return intance;}
	private AccountController() {}

	public void account(AccountBean account) {
		System.out.println("====멤버 컨트롤러");
		System.out.println("화면에서 넘어온객체" + account);
		AccountServiceImpl.getInstance().createAccount(account);
	}
	public void minusAccount() {
		AccountBean acb = null;
		acb = new MinusAccountBean();
		acb.setName(JOptionPane.showInputDialog("name"));
		acb.setUid(JOptionPane.showInputDialog("id"));
		acb.setPass(JOptionPane.showInputDialog("pass"));
		((MinusAccountBean) acb).setLimit(JOptionPane.showInputDialog("limit"));
	//	service.createMinus((MinusAccountBean) acb);
	}
	public void list() {
		AccountBean acb = null;
		//service.list();
	}
	public void findById() {
		AccountBean acb = null;
		acb = new AccountBean();
		acb.setUid(JOptionPane.showInputDialog("id"));
		acb.setPass(JOptionPane.showInputDialog("pass"));
		//JOptionPane.showMessageDialog(null, service.findById(acb));
	}
	public void findByName() {
		AccountBean acb = null;
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void minusList() {
		AccountBean acb = null;
	}
	public void changePass() {
		AccountBean acb = null;
		acb = new AccountBean();
		acb.setUid(JOptionPane.showInputDialog("id"));
		acb.setPass(JOptionPane.showInputDialog("pass") + "/" + JOptionPane.showInputDialog("newPass"));
	//	service.updatePass(acb);
	}
	public void deleteAccount() {
		AccountBean acb = null;
		acb = new AccountBean();
		acb.setUid(JOptionPane.showInputDialog("id"));
		acb.setPass(JOptionPane.showInputDialog("pass"));
		//service.deleteAccount(acb);
	}
}
