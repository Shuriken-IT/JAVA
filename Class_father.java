package Inhertance;

public abstract class Class_father {
	private String name;
	private String cmnd;
	public abstract int salary_Employer();// hàm trừu tượng với keyword abstract nếu trong class
	    // có abstract trên đầu class cũng phải có abstract
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public Class_father() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class_father(String name, String cmnd) {
		super();
		this.name = name;
		this.cmnd = cmnd;
	}
	@Override
	public String toString() {
		return this.name +this.cmnd+"=>>"+salary_Employer();
	}
	// key word extends để kế thừa
	
	

}
