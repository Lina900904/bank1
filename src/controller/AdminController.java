package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;



public class AdminController {
	private static AdminController intance = new AdminController();
	public static AdminController getIntance () {return intance;}
	private AdminController() {}

	public void add() {//직원
		MemberBean member = null; 
		member = new StaffBean();
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		member.setSsn(JOptionPane.showInputDialog("주민번호"));
		member.setAddr(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("폰번호"));
		member.setEmail(JOptionPane.showInputDialog("이메일"));
		//service.createStaff((StaffBean) member);
		
	}
	public void list() {
		//service.list();
	}
	
	public void findById() {
		MemberBean member = null; 
		member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPass(JOptionPane.showInputDialog("패스워드"));
		//JOptionPane.showMessageDialog(null,service.findById(member));
	}
	public void findByName() {
		MemberBean member = null; 
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름")));
	}
	
	public void accountList() {
		AccountBean acb = null;
		//service.list();
	}
	public void findAccountByName() {
		AccountBean acb = null;
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름")));
	}
	
	
	
	
	
	
	
	}


