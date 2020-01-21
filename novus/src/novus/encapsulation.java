package novus;

public class encapsulation {
	
	private String empName;
	private int ssn;
	private int empAge;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public static void main (String args[]) {
		encapsulation e = new encapsulation();
		e.setEmpName("ahmad");
		e.setEmpAge(22);
		e.setSsn(123456789);
		
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpAge());
		System.out.println(e.getSsn());
	}
	
}
