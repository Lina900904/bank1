package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.*;
import serviceImpl.*;



public class AccountController {
	public void account() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account= new AccountBean();
		account.setName(JOptionPane.showInputDialog("NAME"));
		account.setUid(JOptionPane.showInputDialog("USER ID"));
		account.setPass(JOptionPane.showInputDialog("PASS"));
		 service.createAccount(account);
	}
	
	public void list() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		JOptionPane.showMessageDialog(null,service.map());
	}
	
	public void findById() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account= new AccountBean();
		account.setName(JOptionPane.showInputDialog("NAME"));
		account.setPass(JOptionPane.showInputDialog("PASS"));
		JOptionPane.showMessageDialog(null,service.findById(account));
	}
	public void findByName() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("NAME")));
	}
	public void changPass() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account= new AccountBean();
		account.setUid(JOptionPane.showInputDialog("USER ID"));
		account.setPass(JOptionPane.showInputDialog("PASS")+"/"+JOptionPane.showInputDialog("NEWPASS"));
		
		service.chagePass(account);
	}
	public void accountDelet() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account= new AccountBean();
		account.setUid(JOptionPane.showInputDialog("USER ID"));
		account.setPass(JOptionPane.showInputDialog("PASS"));
		service.deleteAccount(account);
	}
}

	
	