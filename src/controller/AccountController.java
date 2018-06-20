package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

enum Butt {
	EXIT, ACCOUNT,  DEPOSIT, WITHDRAW, LIST, FIND_BY_ID, FIND_BY_NAME,  CHANGE_PASS,DELETE_ACCOUNT
}

public class AccountController {

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		AccountBean account = null;
		while (true) {
			switch ((Butt) JOptionPane.showInputDialog(null, "어떤 통장을 만들겠습니까?", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, new Butt[] { Butt.EXIT, Butt.ACCOUNT, 
							Butt.LIST, Butt.FIND_BY_ID, Butt.FIND_BY_NAME,Butt.CHANGE_PASS, Butt.DELETE_ACCOUNT },
					null)) {
			case EXIT:
				return;
			case ACCOUNT:
				account= new AccountBean();
				account.setName(JOptionPane.showInputDialog("NAME"));
				account.setUid(JOptionPane.showInputDialog("USER ID"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				 service.createAccount(account);
				 
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
				break;
			
			case FIND_BY_ID:
				account= new AccountBean();
				account.setName(JOptionPane.showInputDialog("NAME"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				JOptionPane.showMessageDialog(null,service.findById(account));
				break;
			case FIND_BY_NAME:
			
				JOptionPane.showMessageDialog(null, service.seachName(JOptionPane.showInputDialog("NAME")));
				
				break;
			case CHANGE_PASS:
				account= new AccountBean();
				account.setUid(JOptionPane.showInputDialog("USER ID"));
				account.setPass(JOptionPane.showInputDialog("NEWPASS"));
				
				service.chagePass(account);
				break;
			case DELETE_ACCOUNT:
				account= new AccountBean();
				account.setUid(JOptionPane.showInputDialog("USER ID"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				service.deleteAccount(account);
				break;
			default:
				return;
			}

		}
	}

}
