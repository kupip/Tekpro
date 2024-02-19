/* Nama	: Muhammad Rafif Genadratama
 * NIM	: 231524016
 * Kelas: 1A-D4
 * Nama Program: Soal2
 * Deskripsi: Berisi soure code dari soal analisis 2.
 * 
 */

public class Soal2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 42;
		String s = (i<40) ? "life" : (i>50) ? "universe" : "everything";
		// kurang lebih sama seperti ini
//		if (i<40) {
//			s = "life";
//		} else if (i>50) {
//			s = "universe";
//		} else {
//			s = "everything";
//		}
		
		System.out.println(s);
	}
}