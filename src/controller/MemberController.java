package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;



public class MemberController {

	public void join() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		member = new UserBean();

		member.setName(JOptionPane.showInputDialog("이름"));
		member.setUid(JOptionPane.showInputDialog("USER ID"));
		member.setPass(JOptionPane.showInputDialog("비밀번호"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("핸드폰번호"));
		member.setEmail(JOptionPane.showInputDialog("E-MAIL"));
		service.createUser( member);
	}
	public void add() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		member = new StaffBean();
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setUid(JOptionPane.showInputDialog("USER ID"));
		member.setPass(JOptionPane.showInputDialog("비밀번호"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("핸드폰번호"));
		member.setEmail(JOptionPane.showInputDialog("E-MAIL"));
		service.createStaff( member);
	}
	
	public void list() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		JOptionPane.showMessageDialog(null, service.list());
	}
	
	public void findByName() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("비밀번호"));
		service.findById(member);
		
	}
	public void update() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("비밀번호")+"/"+
		JOptionPane.showInputDialog("새비밀번호"));
		service.update(member);
	}
	public void delete() {
		MemberService1 service = new MemberServiceImpl1();
		MemberBean member = null;
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("비밀번호")+"/"+
		JOptionPane.showInputDialog("비밀번호 확인"));
		service.delete(member);
	}
}
	
	