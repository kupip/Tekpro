package exercise_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee{ 
	private double bonus;
	private String secretaryName;

	public Manager (String n, double s,  int y,  int m, int d){ 
		super(n, s, d, m, y);
		secretaryName = "";
		bonus = 0;
	}

	public void raiseSalary(double byPercent){ 
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName(){ 
		return secretaryName;
	}

	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}