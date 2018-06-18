package domain;

public class SalaryBean {

	public static final String DEPT = "인턴쉽";
	protected String dept,name;
	protected int sal;

	public SalaryBean(String name, String sal) {
		setDept(DEPT);
		this.name = name.substring(0, 1);
		this.sal = Integer.parseInt(sal);
		
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return String.format(" %s\n %s%s\n %d원 지급", DEPT, getName(), DEPT, getSal());
	}

}
