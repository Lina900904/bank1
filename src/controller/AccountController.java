package controller;

import javax.swing.JOptionPane;

import domain.Account;
import service.*;
import serviceImpl.*;


enum Butt {
	EXIT, ACCOUNT, MINUS_ACCOUNT, DEPOSIT, WITHDRAW, LIST
}

public class AccountController {

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();

		while(true) {
			switch((Butt) JOptionPane.showInputDialog(null, "어떤 통장을 만들겠습니까?", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, new Butt[] {
							Butt.EXIT, Butt.ACCOUNT, Butt.MINUS_ACCOUNT,
							Butt.LIST
					}, null)) {
			case EXIT: return;
			case ACCOUNT:
				Account account =service.createAccount(
				JOptionPane.showInputDialog("NAME"),
				JOptionPane.showInputDialog("PASS"),
				JOptionPane.showInputDialog("USER ID"));
				
				service.addList(account);
				
				
				break;
			case MINUS_ACCOUNT:
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.showResult());
				break;
			default: return; 
			}
			
		}
		
		
	}
}
