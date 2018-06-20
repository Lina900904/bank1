package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

enum MemberButt {
	EXIT, JOIN, ADD, // 일반유저 추가, ADD는 직원추가
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, WITHDRAWAL
}

public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		while (true) {
			switch ((MemberButt) JOptionPane.showInputDialog(null, "무슨업무를 하시겠습니까?", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null,
					new MemberButt[] { MemberButt.EXIT, MemberButt.JOIN, MemberButt.ADD, MemberButt.LIST,
							MemberButt.FIND_BY_ID, MemberButt.FIND_BY_NAME, MemberButt.COUNT, MemberButt.UPDATE,
							MemberButt.WITHDRAWAL },

					null)) {
			case EXIT:
				return;
			case JOIN: //일반
				break;
			case ADD: //직원 s 아이디 비번 직원번호/
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
			case WITHDRAWAL: // 회원 탈퇴
			
				break;
			default:
				return;
			}

		}
	}

}
