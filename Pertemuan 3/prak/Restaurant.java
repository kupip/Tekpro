package prak;
import java.util.Scanner;

public class Restaurant {
	private Makanan[] makanan;
	private static byte jml_makanan=0;
	private double total_bayar=0;
	
	public Restaurant () {
		makanan = new Makanan[10];
	}

	public void tampilMenuPesan() {
		Scanner inp = new Scanner(System.in);
		String jwb;
		String mkn_pesan;
		int jml_pesan;
		
		jwb = "y";
		while (jwb.compareToIgnoreCase("y")==0) {
			System.out.flush();
			this.tampilMenuMakanan ();
			System.out.print("Silakan pilih makanan yang ingin Anda pesan: ");
			mkn_pesan = inp.nextLine();
			System.out.print("Berapa jumlah makanan yang ingin Anda pesan? ");
			jml_pesan = inp.nextInt();
			inp.nextLine();
			if (this.pesan(mkn_pesan, jml_pesan)) {
				System.out.println("Pesanan anda berhasil");
			} else {
				System.out.println("Pesanan anda tidak berhasil");
			}
			System.out.print("Apakah Anda ingin memesan lagi? (y/n) ");
			jwb = inp.nextLine();
		}
		System.out.println("Total pembelian Anda: " + total_bayar);
		System.out.println("Silakan menuju kasir untuk pembayaran.");
		this.tampilMenuMakanan();
		inp.close();
	}
	
	public boolean pesan(String n, int jml) {
		boolean temu=false;
		boolean valid=false;
		
		for (int i=0; i<jml_makanan; i++) {
			if (makanan[i].getNama().compareToIgnoreCase(n) == 0) {
				if (!isOutOfStock(makanan[i])) {
					if (makanan[i].getStok() >= jml) {
						makanan[i].setStok(makanan[i].getStok() - jml);
						total_bayar = total_bayar + (makanan[i].getHarga() * jml);
						valid=true;
					} else {
						System.out.println("Stok makanan yang Anda pesan tidak mencukupi.");
					}
				} else {
					System.out.println("Stok makanan yang Anda pesan telah habis.");
				}
				temu = true;
				break;
			}
		}
		if (temu == false) {
			System.out.println("Makanan yang Anda pesan tidak terdapat di menu.");
		}
		return valid;
	}
	
	public void tambahMenuMakanan (String nama, double harga, int stok) {
		makanan[jml_makanan] = new Makanan(nama, harga, stok);
		jml_makanan++;
	}
	
	public void tampilMenuMakanan () {
		for (int i=0; i<jml_makanan; i++) {
			if(!isOutOfStock(makanan[i])) {
				System.out.println(makanan[i].getNama() + " ["+ makanan[i].getStok() + "]" + "\tRp. " + makanan[i].getHarga());
			}
		}
	}

	public boolean isOutOfStock(Makanan mkn){
		if (mkn.getStok()== 0) {
			return true;
		} else {
			return false;
		}
	}
}