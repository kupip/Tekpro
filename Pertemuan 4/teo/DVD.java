package teo;

public abstract class DVD {
	private String judul;
	private String publisher;
	private String kategori;
	private int stok;
	
	public int getStok() {
		return stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public String getJudul() {
		return judul;
	}
	
	public void setJudul(String judul) {
		this.judul = judul;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getKategori() {
		return kategori;
	}
	
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
}