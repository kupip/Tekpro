package exercise_3;

public class Employee extends Sortable{ 
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
	
	public Employee(String n, double s, int day, int month, int year){ 
		 name = n;
		 salary = s;
		 hireday = day;
		 hiremonth = month;
		 hireyear = year;
	}
	
	public void print(){ 
		System.out.println(name + " " + salary + " " + hireYear());
	}
	
	public void raiseSalary(double byPercent){ 
		salary *= 1 + byPercent / 100;
	}
	
	public int compare(Sortable b){
		 Employee eb = (Employee) b;
		 if (salary<eb.salary) return -1;
		 if (salary>eb.salary) return +1;
		 return 0;
	}

	
	public int hireYear(){ 
		return hireyear;
	}
	
	public int getHireday() {
		return hireday;
	}

	public void setHireday(int hireday) {
		this.hireday = hireday;
	}

	public int getHiremonth() {
		return hiremonth;
	}

	public void setHiremonth(int hiremonth) {
		this.hiremonth = hiremonth;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}
}