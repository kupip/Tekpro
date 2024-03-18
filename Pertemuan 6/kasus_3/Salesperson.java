package kasus_3;

public class Salesperson implements Comparable<Salesperson> {
	private String firstName, lastName;
	private int totalSales;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	public Salesperson (String first, String last, int sales) {
		firstName=first;
		lastName=last;
		totalSales=sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ": " + totalSales;
	}
	
	public boolean equals(Object other) {
		return (lastName.equals(((Salesperson) other).getLastName()) &&
				firstName.equals(((Salesperson) other).getFirstName()));
	}
	
	public int compareTo(Salesperson other) {
		int result;
		if (totalSales > ((Salesperson) other).getTotalSales()) {
			result=1;
		} else if (totalSales < ((Salesperson) other).getTotalSales()) {
			result=-1;
		} else {
			if (lastName.compareTo(((Salesperson )other).getLastName()) > 0) {
				result=1;
			} else {
				result=-1;
			}
		}
		return result;
	}
}