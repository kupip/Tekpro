package teo;

import java.util.Scanner;

public class menuDVD {
	private DVDFilm[] arr_film = new DVDFilm[15];
	private DVDMusik[] arr_musik = new DVDMusik[15];

	public static void main(String args[]) {
		menuDVD aMenu = new menuDVD();
		aMenu.alurUtama();
		aMenu.inisialisasiArr_Film();
		aMenu.tampilFilm();
	}
	
	public void alurUtama() {
		Scanner inp = new Scanner(System.in);
		int jwb;
		
		System.out.println("Apa yang ingin anda tampilkan? (pilih dengan mengetik angka saja)");
		System.out.println("1. Film");
		System.out.println("2. Musik");
		jwb = inp.nextInt();
		inp.nextLine();
		while (jwb != 1 && jwb != 2) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">>");
			jwb = inp.nextInt();
			inp.nextLine();
		}
		if (jwb == 1) {
			tampilFilm();
		}
	}
	
	public void tampilFilm() {
		System.out.println(" No | Judul                          | Publisher       | Pemeran");
		for (int i=0; i<2; i++) {
			System.out.printf(" %2d | %-30s | %-15s\n", i+1, arr_film[i].getJudul(), arr_film[i].getPublisher());
		}
	}
	
	public void inisialisasiArr_Film() {
		arr_film[0] = new DVDFilm("Fight Club", "Fox Pictures", "D", 25, "David Fincher", 2); // elemen ke-0
		arr_film[0].setPemeran("Brad Pitt", 0);
		arr_film[0].setPemeran("Edward Norton", 1);
		
		arr_film[1] = new DVDFilm("Laskar Pelangi", "Mizan Production", "SU", 25, "Riri RIza", 3);
		arr_film[1].setPemeran("Zulfanny", 0);
		arr_film[1].setPemeran("Ferdian", 1);
		arr_film[1].setPemeran("Verrys Yamarno", 2);
	}
	
	public void inisialisasiArr_Musik() {
		arr_musik[0] = new DVDMusik("Menari dengan Bayangan", "Sun Eater Studio", "P", 15, "Hindia", "Baskara Putra", 2); // elemen ke-0
		arr_musik[0].setTop_hits();;
		arr_musik[0].setPemeran("Edward Norton", 1);
		
		arr_film[1] = new DVDFilm("Laskar Pelangi", "Mizan Production", "SU", 25, "Riri RIza", 3);
		arr_film[1].setPemeran("Zulfanny", 0);
		arr_film[1].setPemeran("Ferdian", 1);
		arr_film[1].setPemeran("Verrys Yamarno", 2);
	}
}