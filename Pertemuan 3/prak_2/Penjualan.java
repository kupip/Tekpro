package prak_2;

public class Penjualan {
	private String nama_produk;
	private double harga_total;
	private int quantity=0;
	
	public Penjualan(String nama, double harga_satuan, int quantity) {
		this.setNama_produk(nama);
		this.setQuantity(quantity);
		this.setHarga_total(harga_satuan * quantity);
	}

	public double getHarga_total() {
		return harga_total;
	}

	public void setHarga_total(double harga_total) {
		this.harga_total = harga_total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}
}