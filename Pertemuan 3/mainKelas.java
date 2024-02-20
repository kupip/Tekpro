import java.util.Scanner;

public class mainKelas {
	private static Scanner inp = new Scanner(System.in);
	private static String answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elektronik alat1 = new Elektronik("terminal");
		nonElektronik alat_non1 = new nonElektronik("meja");
		
		System.out.println("Apakah anda ingin menyiapkan " + alat1.getNama() + "? (y/n)");
		answer = inp.nextLine();
		if (answer.compareToIgnoreCase("y") == 0) {
			alat1.set_up();
		}
		
		System.out.println("Apakah anda ingin menyiapkan " + alat_non1.getNama() + "? (y/n)");
		answer = inp.nextLine();
		if (answer.compareToIgnoreCase("y") == 0) {
			alat_non1.set_up();
		}
		
		System.out.println("Apakah anda ingin merapikan " + alat1.getNama() + "? (y/n)");
		answer = inp.nextLine();
		if (answer.compareToIgnoreCase("y") == 0) {
			alat1.merapikan();
		}
		
		System.out.println("Apakah anda ingin merapikan " + alat_non1.getNama() + "? (y/n)");
		answer = inp.nextLine();
		if (answer.compareToIgnoreCase("y") == 0) {
			alat_non1.merapikan();
		}
	}
}