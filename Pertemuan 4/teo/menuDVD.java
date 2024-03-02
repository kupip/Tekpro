package teo;

import java.util.Scanner;

public class menuDVD {
	private DVDFilm[] arr_film = new DVDFilm[15];
	private DVDMusik[] arr_musik = new DVDMusik[15];
	private byte idx_film=2;
	private byte idx_musik=2;
	
	public static void main(String args[]) {
		menuDVD aMenu = new menuDVD();
		aMenu.alurUtama();
	}
	
	public void alurUtama() {
		Scanner inp = new Scanner(System.in);
		String jwb;
		inisialisasiArr_Film();
		inisialisasiArr_Musik();
		
		System.out.println("Apa yang ingin anda tampilkan? (pilih dengan mengetik angka saja)");
		System.out.println("1. Film");
		System.out.println("2. Musik");
		System.out.println("3. Tidak Ada");
		System.out.print(">> ");
		
		jwb = inp.nextLine();
		while (!jwb.equals("1") && !jwb.equals("2") && !jwb.equals("3")) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">> ");
			jwb = inp.nextLine();
		}
		if (jwb.equals("1")) {
			tampilFilm();
		} else if (jwb.equals("2")) {
			tampilMusik();
		}
		
		// Memasukkan entri
		System.out.println("Apakah anda memasukkan entri baru? (ya/tidak)");
		System.out.print(">> ");
		jwb = inp.nextLine();
		while (jwb.compareToIgnoreCase("ya") != 0 && jwb.compareToIgnoreCase("tidak") != 0) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">> ");
			jwb = inp.nextLine();
		}
		
		while (jwb.compareToIgnoreCase("ya") == 0 ) {
			if (jwb.compareToIgnoreCase("ya") == 0) {
				System.out.println("Entri mana yang ingin Anda masukkan?");
				System.out.println("1. Film");
				System.out.println("2. Musik");
				jwb = inp.nextLine();
				while (!jwb.equals("1") && !jwb.equals("2")) {
					System.out.println("Tolong masukkan input yang valid");
					System.out.print(">> ");
					jwb = inp.nextLine();
				}
				if (jwb.equals("1")) {
					jwb = "ya";
					while (jwb.compareToIgnoreCase("ya")==0) {
						entriFilm(idx_film);
						this.idx_film++;
						System.out.println("Apakah anda memasukkan entri film lain? (ya/tidak)");
						System.out.print(">> ");
						jwb = inp.nextLine();
						while (jwb.compareToIgnoreCase("ya") != 0 && jwb.compareToIgnoreCase("tidak") != 0) {
							System.out.println("Tolong masukkan input yang valid");
							System.out.print(">> ");
							jwb = inp.nextLine();
						}
					}
				} else {
					jwb = "ya";
					while (jwb.compareToIgnoreCase("ya")==0) {
						entriMusik(idx_musik);
						this.idx_musik++;
						System.out.println("Apakah anda memasukkan entri musik lain? (ya/tidak)");
						System.out.print(">> ");
						jwb = inp.nextLine();
						while (jwb.compareToIgnoreCase("ya") != 0 && jwb.compareToIgnoreCase("tidak") != 0) {
							System.out.println("Tolong masukkan input yang valid");
							System.out.print(">> ");
							jwb = inp.nextLine();
						}
					}
				}
			}
			System.out.println("Apakah anda memasukkan entri baru? (ya/tidak)");
			System.out.print(">> ");
			jwb = inp.nextLine();
			while (jwb.compareToIgnoreCase("ya") != 0 && jwb.compareToIgnoreCase("tidak") != 0) {
				System.out.println("Tolong masukkan input yang valid");
				System.out.print(">> ");
				jwb = inp.nextLine();
			}
		}
		System.out.println("Apa yang ingin anda tampilkan? (pilih dengan mengetik angka saja)");
		System.out.println("1. Film");
		System.out.println("2. Musik");
		System.out.println("3. Tidak Ada");
		System.out.print(">> ");
		
		jwb = inp.nextLine();
		while (!jwb.equals("1") && !jwb.equals("2") && !jwb.equals("3")) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">> ");
			jwb = inp.nextLine();
		}
		if (jwb.equals("1")) {
			tampilFilm();
		} else if (jwb.equals("2")) {
			tampilMusik();
		}
		inp.close();
	}
	
	public void entriFilm(byte idx) {
		Scanner inp = new Scanner(System.in);
		String temp_judul;
		String temp_pub;
		String temp_dir;
		String temp_kat;
		String temp_aktor;
		int temp_stok;
		
		System.out.print("Masukkan judul film: ");
		temp_judul = inp.nextLine();
		System.out.print("Masukkan nama publisher: ");
		temp_pub = inp.nextLine();
		System.out.print("Masukkan sutradara: ");
		temp_dir = inp.nextLine();
		System.out.println("Silakan pilih kategori dengan mengetik angkanya saja:");
		System.out.println("1. Semua Umur");
		System.out.println("2. Dewasa");
		System.out.println("3. Remaja");
		System.out.println("4. Anak-anak");
		System.out.print(">> ");
		temp_kat = inp.nextLine();
		while (!temp_kat.equals("1") && !temp_kat.equals("2") && !temp_kat.equals("3") && !temp_kat.equals("4")) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">> ");
			temp_kat= inp.nextLine();
		}
		switch (temp_kat) {
		case "1":
			temp_kat = "SU";
			break;
		case "2":
			temp_kat = "D";
			break;
		case "3":
			temp_kat = "R";
			break;
		case "4":
			temp_kat = "A";
			break;
		}
		System.out.print("Masukkan jumlah stok: ");
		temp_stok = inp.nextInt();
		inp.nextLine();
		System.out.println("Masukkan nama-nama pemeran. Jika pemeran lebih dari satu, pisahkan dengan koma");
		System.out.print(">> ");
		temp_aktor = inp.nextLine();
		arr_film[idx] = new DVDFilm(temp_judul, temp_pub, temp_kat, temp_stok, temp_dir, temp_aktor.split(", "));
		inp.close();
	}
	
	public void entriMusik(byte idx) {
		Scanner inp = new Scanner(System.in);
		String temp_judul;
		String temp_pub;
		String temp_prod;
		String temp_kat;
		String temp_singer;
		int temp_stok;
		String temp_hits;
		
		System.out.print("Masukkan judul album: ");
		temp_judul = inp.nextLine();
		System.out.print("Masukkan nama publisher: ");
		temp_pub = inp.nextLine();
		System.out.print("Masukkan nama produser: ");
		temp_prod = inp.nextLine();
		System.out.print("Masukkan nama penyanyi: ");
		temp_singer = inp.nextLine();
		System.out.println("Silakan pilih kategori dengan mengetik angkanya saja:");
		System.out.println("1. Classic");
		System.out.println("2. Jazz");
		System.out.println("3. Pop");
		System.out.println("4. Rock");
		System.out.println("5. Other");
		System.out.print(">> ");
		temp_kat = inp.nextLine();
		while (!temp_kat.equals("1") && !temp_kat.equals("2") && !temp_kat.equals("3") && !temp_kat.equals("4") && !temp_kat.equals("5")) {
			System.out.println("Tolong masukkan input yang valid");
			System.out.print(">> ");
			temp_kat= inp.nextLine();
		}
		switch (temp_kat) {
		case "1":
			temp_kat = "C";
			break;
		case "2":
			temp_kat = "J";
			break;
		case "3":
			temp_kat = "P";
			break;
		case "4":
			temp_kat = "R";
			break;
		case "5":
			temp_kat = "O";
			break;
		}
		System.out.print("Masukkan jumlah stok: ");
		temp_stok = inp.nextInt();
		inp.nextLine();
		System.out.println("Masukkan lagu-lagu top hits. Jika ada lebih dari satu, pisahkan dengan koma");
		System.out.print(">> ");
		temp_hits = inp.nextLine();
		arr_musik[idx] = new DVDMusik(temp_judul, temp_pub, temp_kat, temp_stok, temp_singer, temp_prod, temp_hits.split(", "));
		inp.close();
	}
	
	public void tampilFilm() {
		for (int i=0; i<arr_film.length; i++) {
			if (arr_film[i] != null) {
				System.out.printf("%2d. Judul    : %s\n", i+1, arr_film[i].getJudul());
				System.out.println("    Publisher: " + arr_film[i].getPublisher());
				System.out.println("    Sutradara: " + arr_film[i].getSutradara());
				System.out.print("    Kategori : ");
				switch (arr_film[i].getKategori()) {
					case "SU":
						System.out.println("Semua Umur");
						break;
					case "D":
						System.out.println("Dewasa");
						break;
					case "A":
						System.out.println("Anak-anak");
						break;
					case "R":
						System.out.println("Remaja");
						break;
				}
				System.out.print("    Pemeran  : ");
				for (int j=0; j<arr_film[i].getPemeran().length; j++) {
					System.out.print(arr_film[i].getPemeran()[j]);
					if (j != arr_film[i].getPemeran().length -1) {
						System.out.print(", ");
					}
				}
				System.out.println();
				System.out.println("    Stok     : " + arr_film[i].getStok());
				System.out.println();
			}
		}
	}
	
	public void tampilMusik() {
		for (int i=0; i<arr_musik.length; i++) {
			if (arr_musik[i] != null) {
				System.out.printf("%2d. Judul    : %s\n", i+1, arr_musik[i].getJudul());
				System.out.println("    Publisher: " + arr_musik[i].getPublisher());
				System.out.print("    Kategori : ");
				switch (arr_musik[i].getKategori()) {
					case "C":
						System.out.println("Klasik");
						break;
					case "J":
						System.out.println("Jazz");
						break;
					case "R":
						System.out.println("Rock");
						break;
					case "O":
						System.out.println("Other");
						break;
					case "P":
						System.out.println("Pop");
						break;
				}
				System.out.println("    Penyanyi : " + arr_musik[i].getPenyanyi());
				System.out.println("    Produser : " + arr_musik[i].getProduser());
				System.out.print("    Top Hits : ");
				for (int j=0; j<arr_musik[i].getTop_hits().length; j++) {
					System.out.print(arr_musik[i].getTop_hits()[j]);
					if (j != arr_musik[i].getTop_hits().length -1) {
						System.out.print(", ");
					}
				}
				System.out.println();
				System.out.println("    Stok     : " + arr_musik[i].getStok());
				System.out.println();
			}
		}
	}
	
	public void inisialisasiArr_Film() {
		String[] aktor = {"Brad Pitt", "Edward Norton"};
		arr_film[0] = new DVDFilm("Fight Club", "Fox Pictures", "D", 25, "David Fincher", aktor);
		
		String[] aktor2 = {"Zulfanny", "Ferdian", "Verrys Yamarno"};
		arr_film[1] = new DVDFilm("Laskar Pelangi", "Mizan Production", "SU", 25, "Riri Riza", aktor2);
	}
	
	public void inisialisasiArr_Musik() {
		String[] hits = {"Secukupnya", "Rumah ke Rumah"};
		arr_musik[0] = new DVDMusik("Menari dengan Bayangan", "Sun Eater Studio", "P", 15, "Hindia", "Baskara Putra", hits);
		
		String[] hits2 = {"Mimpi yang Sempurna", "Topeng"};
		arr_musik[1] = new DVDMusik("Taman Langit", "Musica Studios", "R", 10, "Noah", "Capung", hits2);
	}
}