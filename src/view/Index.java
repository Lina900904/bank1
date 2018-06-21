package view;

import javax.swing.JOptionPane;

import controller.*;
import domain.MemberBean;
import domain.UserBean;
import service.MemberService1;
import serviceImpl.MemberServiceImpl1;

enum MemberButt {
	EXIT, JOIN, ADD, // 일반유저 추가, ADD는 직원추가
	LIST, FIND_BY_ID, FIND_BY_NAME, COUNT, UPDATE, WITHDRAWAL
}

public class Index {

	public static void main(String[] args) {
		MemberService1 service = new MemberServiceImpl1();
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
				member = new UserBean();

				member.setName(JOptionPane.showInputDialog("이름"));
				member.setUid(JOptionPane.showInputDialog("USER ID"));
				member.setPass(JOptionPane.showInputDialog("비밀번호"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setAddr(JOptionPane.showInputDialog("주소"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호"));
				member.setEmail(JOptionPane.showInputDialog("E-MAIL"));
				service.createUser( (UserBean) member);
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
