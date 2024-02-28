package prak;

public class Makanan {
	private String nama;
	private double harga=0;
	private int stok=0;
	
	public Makanan(String n, double harga, int stock) {
		this.nama = n;
		this.harga = harga;
		setStok(stock);
	}

	public String getNama() {
		return nama;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public double getHarga() {
		return harga;
	}
}