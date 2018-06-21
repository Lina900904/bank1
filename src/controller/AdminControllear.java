package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

enum AdminButt {
	EXIT, JOIN, ADD, // 일반유저 추가, ADD는 직원추가
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, REMOVE
}

public class AdminControllear {

	public static void main(String[] args) {
		AdminService service = new AdminServiceImpl();
	//	adminBean admin = null;
		while (true) {
			switch ((AdminButt) JOptionPane.showInputDialog(null, "무슨업무를 하시겠습니까?", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null,
					new AdminButt[] { AdminButt.EXIT, AdminButt.JOIN, AdminButt.ADD, AdminButt.LIST,
							AdminButt.FIND_BY_ID, AdminButt.FIND_BY_NAME, AdminButt.COUNT, AdminButt.UPDATE,
							AdminButt.REMOVE },

					null)) {
			case EXIT:
				return;
			case JOIN: // 일반
				break;
			case ADD: // 직원 s 아이디 비번 직원번호/
				break;
			case LIST:
				break;

			case FIND_BY_ID:

				break;
			case FIND_BY_NAME:

				break;
			case COUNT:

				break;
			case UPDATE: // 아이디 비번받아서 비번만 변경

				break;
			case REMOVE: // 회원 탈퇴

				break;
			default:
				return;
			}

		}
	}

}
