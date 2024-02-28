package prak_2;

import java.util.Scanner;

public class menuUtama {
	private Produk[] arr_produk = new Produk[10];
	private Penjualan[] arr_penjualan = new Penjualan[10];
	private double total_bayar=0;
	
	public menuUtama() {
		this.setArrProduk();
	}
	
	public void setArrProduk() {
		arr_produk[0] = new Produk("Batagor", 5000, 20);
		arr_produk[1] = new Produk("Roti Bakar", 12000, 35);
		arr_produk[2] = new Produk("Indomie + Telor", 10000, 50);
		arr_produk[3] = new Produk("Kwetiau", 12000, 15);
		arr_produk[4] = new Produk("Nasi Goreng", 12000, 40);
		arr_produk[5] = new Produk("Air Mineral", 3000, 20);
		arr_produk[6] = new Produk("Teh Manis", 4000, 65);
		arr_produk[7] = new Produk("Jus Alpukat", 8000, 30);
		arr_produk[8] = new Produk("Teh Botol", 5000, 45);
		arr_produk[9] = new Produk("Kopi", 3000, 20);
	}

	public void tampilMenu() {
		Scanner inp = new Scanner(System.in);
		int id_pesan=0;
		int jml_pesan=0;
		int idx_jual=0;
		String masih_pesan;
	
		this.tampilMakanan();
		masih_pesan = "ya";
		while (masih_pesan.equalsIgnoreCase("ya")) {
			System.out.println("Item nomor berapa yang ingin anda pesan?");
			System.out.print(">> ");
			id_pesan = inp.nextInt();
			inp.nextLine();
			System.out.println("Berapa jumlah yang ingin Anda pesan?");
			System.out.print(">> ");
			jml_pesan = inp.nextInt();
			inp.nextLine();
			
			// Mengecek apakah pesanan yang dilakukan valid (dengan mengecek index yang dipilih dan jumlah yang dipesan)
			if (pesanProduk(id_pesan, jml_pesan, idx_jual)) {
				idx_jual++;
				System.out.println("Apakah anda masih ingin memesan? (ya/tidak)");
				System.out.print(">> ");
				masih_pesan = inp.nextLine();
				while (!masih_pesan.equalsIgnoreCase("ya") && !masih_pesan.equalsIgnoreCase("tidak")) {
					System.out.println("Tolong masukkan jawaban yang valid.");
					System.out.print(">> ");
					masih_pesan = inp.nextLine();
				}
			} else {
				continue;
			}
		}
		// Menampilkan item yang telah dipesan
		tampilPesanan(idx_jual);
		inp.close();
	}
	
	public void tampilMakanan() {
		System.out.println("Selamat datang.");
		System.out.println("Daftar Menu");
		System.out.println("-------------------");
		System.out.println("| No | Nama            | Harga | Qty |");
		for (int i=0; i<10; i++) {
			System.out.printf("| %2d | %-15s | %5.0f | %3d |\n", (i+1), arr_produk[i].getNama_produk(),
					arr_produk[i].getHarga(), arr_produk[i].getQty());
		}
	}
	
	public boolean pesanProduk(int id, int jml, int idx) {
		if (id <=10) {
			id--;
			if (arr_produk[id].getQty() >= jml) {
				arr_penjualan[idx] = new Penjualan(arr_produk[id].getNama_produk(), arr_produk[id].getHarga(), jml);
				
				// Pengurangan  stok
				arr_produk[id].setQty(arr_produk[id].getQty()-jml);
				total_bayar = total_bayar + arr_penjualan[idx].getHarga_total();
				return true;
			} else {
				System.out.println("Jumlah yang anda pesan melebihi stok yang tersedia.");
				return false;
			}
		} else {
			System.out.println("Silakan masukkan nomor yang valid.");
			return false;
		}
	}
	
	public void tampilPesanan(int jml_dipesan) {
		System.out.println("\nDaftar Pesanan");
		System.out.println("================================");
		System.out.println("No. Nama Makanan   Jumlah  Total");
		for (int i=0; i<jml_dipesan; i++) {
			System.out.printf("%2d. %-15s %5d  %.0f\n", i+1, arr_penjualan[i].getNama_produk(),arr_penjualan[i].getQuantity(), arr_penjualan[i].getHarga_total());
		}
		System.out.printf("\nGrand Total       = Rp%10.0f\n", total_bayar);
		System.out.println("================================");
		System.out.println("Terima kasih telah bertransaksi di tempat kami :)");
	}
}