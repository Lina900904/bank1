package controller;

import javax.swing.JOptionPane;

import domain.Account;
import domain.AccountBean;
import domain.MinusAccountBean;
import service.*;
import serviceImpl.*;

enum Butt {
	EXIT, ACCOUNT, MINUS_ACCOUNT, DEPOSIT, WITHDRAW, LIST, FIND_BY_ID, FIND_BY_NAME, MINUS_LIST
}

public class AccountController {

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		AccountBean account = null;
		while (true) {
			switch ((Butt) JOptionPane.showInputDialog(null, "어떤 통장을 만들겠습니까?", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, new Butt[] { Butt.EXIT, Butt.ACCOUNT, Butt.MINUS_ACCOUNT,
							Butt.LIST, Butt.FIND_BY_ID, Butt.MINUS_LIST },
					null)) {
			case EXIT:
				return;
			case ACCOUNT:
				account = new AccountBean();

				/*
				 * service.createAccount( JOptionPane.showInputDialog("NAME"),
				 * JOptionPane.showInputDialog("PASS"), JOptionPane.showInputDialog("USER ID"));
				 */

				account.setName(JOptionPane.showInputDialog("NAME"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				account.setUid(JOptionPane.showInputDialog("USER ID"));

				service.createAccount(account);
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
					break;
			case MINUS_ACCOUNT:
				
				account = new MinusAccountBean();
				
				account.setName(JOptionPane.showInputDialog("NAME"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				account.setUid(JOptionPane.showInputDialog("USER ID"));
				((MinusAccountBean) account).setLimit(JOptionPane.showInputDialog("Limit"));
				service.createMinusAccount(account);
				break;
			case MINUS_LIST:
				JOptionPane.showMessageDialog(null, service.mList());
				break;
			case FIND_BY_ID:
				/*
				 * ID, PASS 받아서 일치하면 계좌 내역을 보여줘,단 혹시모르니 비번은 ****으로 처리해
				 */
				String id = "";
				String pass = "";
				account = new AccountBean();
				account.setUid(JOptionPane.showInputDialog("ID"));
				account.setPass(JOptionPane.showInputDialog("PASS"));
				AccountBean a = service.findById(account);
				JOptionPane.showMessageDialog(null, service.findById(account));
				break;
			case FIND_BY_NAME:

				JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("Name")));
				break;
			
			default:
				return;
			}

		}
	}

}
