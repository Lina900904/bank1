package controller;

import java.util.List;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class MemberController {
	private static MemberController instance= new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
		
	public void join(UserBean user) {
		System.out.println("====멤버 컨트롤러");
		System.out.println("화면에서 넘어온객체" + user);
		MemberServiceImpl.getInstance().createUser(user);
	}

	public void add() {// 직원
		MemberBean member = null;
		member = new StaffBean();
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("폰번호"));
		member.setEmail(JOptionPane.showInputDialog("이메일"));
		// service.createStaff((StaffBean) member);

	}

	public void list() {
		MemberBean member = null;
		// service.list();
	}

	public void findById() {
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		// JOptionPane.showMessageDialog(null,service.findById(member));
	}

	public void findByName() {
		MemberBean member = null;
		// JOptionPane.showMessageDialog(null,
		// service.findByName(JOptionPane.showInputDialog("이름")));
	}

	public void count() {
		MemberBean member = null;
		// JOptionPane.showMessageDialog(null, service.selectCount());
	}

	public void update() {
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드") + "/" + JOptionPane.showInputDialog("새 패스워드"));
		//service.updatePass(member);
	}

	public void withdrawal() {
		MemberBean member = null;
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드") + "/" + JOptionPane.showInputDialog("패스워드 확인"));
		//service.deleteMember(member);
	}
}
