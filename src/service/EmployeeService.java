package service;

import domain.SalaryBean;

public interface EmployeeService {
	public SalaryBean createSalary(String name, String sal);
	public int basePay(int sal);
	
	
}
