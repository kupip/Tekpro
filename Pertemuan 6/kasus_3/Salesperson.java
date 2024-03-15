package kasus_3;

public class Salesperson implements Comparable {
	private String firstName, lastName;
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

	private int totalSales;
	
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
	
	public int compareTo(Object other) {
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
