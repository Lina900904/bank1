package controller;

import javax.swing.JOptionPane;

import domain.OwnerSalary;
import domain.SalaryBean;
import domain.StaffSalary;
import service.EmployeeService;
import serviceImpl.EmployeeServiceImpl;

enum SalaryButt {
	EXIT, INTERN, STAFF, OWNER
;

	public static void main(String[] args) {
		SalaryButt[] buttons = { SalaryButt.EXIT, SalaryButt.INTERN, SalaryButt.STAFF, SalaryButt.OWNER };
		EmployeeService employeeService = new EmployeeServiceImpl();
		String salary = null;
		while (true) {
			switch ((SalaryButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
			case EXIT:
				return;
			case INTERN:
				JOptionPane.showMessageDialog(null,
						salary= new SalaryBean(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("기본급")
						).toString());
				break;

			case STAFF:
				JOptionPane.showMessageDialog(null,
						salary= new StaffSalary(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("기본급")
						).toString());
				break;
				
	case OWNER:
				JOptionPane.showMessageDialog(null,
						salary= new OwnerSalary(
								JOptionPane.showInputDialog("이름"),
								JOptionPane.showInputDialog("기본급")
								).toString());
					
				break;
			default:
				break;

			}
		}
	}
}

