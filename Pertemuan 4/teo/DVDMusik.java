package teo;

public class DVDMusik extends DVD{
	private String penyanyi;
	private String produser;
	private String[] top_hits;

	public DVDMusik(String judul, String publisher, String kategori, int stok, String penyanyi, String produser, int jml_hits) {
		super.setJudul(judul); // superclass
		super.setPublisher(publisher); // superclass
		super.setKategori(kategori); // superclass
		super.setStok(stok); // superclass
		this.setPenyanyi(penyanyi);
		this.setProduser(produser);
		this.top_hits = new String[jml_hits];
	}
	
	public String[] getTop_hits() {
		return top_hits;
	}
	public void setTop_hits(String[] top_hits) {
		this.top_hits = top_hits;
	}
	public String getPenyanyi() {
		return penyanyi;
	}

	public void setPenyanyi(String penyanyi) {
		this.penyanyi = penyanyi;
	}

	public String getProduser() {
		return produser;
	}

	public void setProduser(String produser) {
		this.produser = produser;
	}
}