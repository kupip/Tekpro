import java.util.Scanner;

public class Soal5 {
	private static Scanner inp = new Scanner(System.in);
	String inp1;
	String inp2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Masukkan string pertama: ");
		String inp1 = inp.nextLine();
		System.out.print("Masukkan string kedua: ");
		String inp2 = inp.nextLine();
		inp.close();
		
		System.out.println("Panjang total kedua string: " + (inp1.length() + inp2.length()));
		
		if (inp1.compareTo(inp2) > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		System.out.println(inp1.substring(0, 1).toUpperCase().concat(inp1.substring(1, inp1.length())) + " " +
		inp2.substring(0, 1).toUpperCase().concat(inp2.substring(1, inp2.length())));
	}
}