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
				// uid,pass,name,ssn,addr,phone,email;
				member = new UserBean();

				member.setName(JOptionPane.showInputDialog("이름"));
				member.setUid(JOptionPane.showInputDialog("USER ID"));
				member.setPass(JOptionPane.showInputDialog("비밀번호"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setAddr(JOptionPane.showInputDialog("주소"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호"));
				member.setEmail(JOptionPane.showInputDialog("E-MAIL"));
				service.crateJoin( member);
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case ADD: //직원 s 아이디 비번 직원번호/
				member = new StaffBean();
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setUid(JOptionPane.showInputDialog("USER ID"));
				member.setPass(JOptionPane.showInputDialog("비밀번호"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				member.setAddr(JOptionPane.showInputDialog("주소"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호"));
				member.setEmail(JOptionPane.showInputDialog("E-MAIL"));
				service.crateStaffJoin( member);
				break;
			case FIND_BY_ID:
				member = new MemberBean();
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setPass(JOptionPane.showInputDialog("비밀번호"));
				service.findById(member);
				
				break;
			case FIND_BY_NAME:
				service.findByName(JOptionPane.showInputDialog("이름"));
				
				break;
			case COUNT:
			JOptionPane.showMessageDialog(null, service.count());
				
				break;
			case UPDATE: // 아이디 비번받아서 비번만 변경
				member = new MemberBean();
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setPass(JOptionPane.showInputDialog("비밀번호")+"/"+
				JOptionPane.showInputDialog("비밀번호"));
				service.update(member);
								
				break;
			case WITHDRAWAL: // 회원 탈퇴
				
			
				break;
			default:
				return;
			}

		}
	}

}
