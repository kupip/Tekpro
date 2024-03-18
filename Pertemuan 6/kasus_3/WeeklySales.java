package kasus_3;
import java.util.Scanner;

public class WeeklySales {
	 private static Salesperson[] salesStaff;
	
	public static void main(String args[]) {
		displayHardCoded();
		displayMenu();
	}
	
	public static void displayMenu() {
		int size;
		String first, last;
		int sales;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nHow many salesperson do you want to input? ");
		size=scan.nextInt();
		scan.nextLine();
		salesStaff=new Salesperson[size];
		
		for (int i=0; i<size; i++) {
			System.out.print("Enter first name: ");
			first = scan.nextLine();
			System.out.print("Enter last name: ");
			last = scan.nextLine();
			System.out.print("Enter sales: ");
			sales = scan.nextInt();
			scan.nextLine();
			salesStaff[i]=new Salesperson(first, last, sales);
		}
		Sorting.insertionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week");
		
		for (Salesperson s: salesStaff)
			System.out.println(s);
		scan.close();
	}
	
	public static void displayHardCoded() {
		Salesperson[] salesStaff=new Salesperson[10];
		
		salesStaff[0]= new Salesperson ("Jane", "Jones", 3000);
		salesStaff[1]= new Salesperson ("Daffy", "Duck", 4935);
		salesStaff[2]= new Salesperson ("James", "Jones", 3000);
		salesStaff[3]= new Salesperson ("Dick", "Walter", 2800);
		salesStaff[4]= new Salesperson ("Don", "Trump", 1570);
		salesStaff[5]= new Salesperson ("Jane", "Black", 3000);
		salesStaff[6]= new Salesperson ("Harry", "Taylor", 7300);
		salesStaff[7]= new Salesperson ("Andy", "Adams", 5000);
		salesStaff[8]= new Salesperson ("Jim", "Doe", 2850);
		salesStaff[9]= new Salesperson ("Walt", "Smith", 3000);
		
		Sorting.insertionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week");
		
		for (Salesperson s: salesStaff)
			System.out.println(s);
	}
}