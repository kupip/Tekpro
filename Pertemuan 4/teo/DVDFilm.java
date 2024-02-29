package teo;

public final class DVDFilm extends DVD{
	private String[] pemeran= new String[10];
	private String sutradara;
	
	public DVDFilm(String judul, String publisher, String kategori, int stok, String sutradara, String[] pemeran) {
		super.setJudul(judul);
		super.setPublisher(publisher);
		super.setKategori(kategori);
		super.setStok(stok);
		this.setSutradara(sutradara);
		this.pemeran= pemeran;
	}
	
	public String getSutradara() {
		return sutradara;
	}
	
	public void setSutradara(String sutradara) {
		this.sutradara = sutradara;
	}

	public String[] getPemeran() {
		return pemeran;
	}

	public void setPemeran(String[] pemeran) {
		this.pemeran = pemeran;
	}
}