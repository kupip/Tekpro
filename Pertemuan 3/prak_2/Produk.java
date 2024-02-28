package prak_2;

public class Produk {
	private String nama_produk;
	private double harga;
	private int qty;
	
	public Produk(String nama, double harga, int qty) {
		this.nama_produk = nama;
		this.harga = harga;
		this.setQty(qty);
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public double getHarga() {
		return harga;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}