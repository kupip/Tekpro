package teo;

import java.util.Scanner;

public final class DVDFilm extends DVD{
	private String[] pemeran;
	private String sutradara;
	private int jml_pemeran;
	
	public DVDFilm(String judul, String publisher, String kategori, int stok, String sutradara, int jml_pemeran) {
		super.setJudul(judul);
		super.setPublisher(publisher);
		super.setKategori("D");
		super.setStok(stok);
		this.setSutradara(sutradara);
		this.pemeran = new String[jml_pemeran];
	}
	
	public String getSutradara() {
		return sutradara;
	}
	
	public void setSutradara(String sutradara) {
		this.sutradara = sutradara;
	}
	
	public void setPemeran(String pemeran, int idx) {
		this.pemeran[idx] = pemeran;
	}
}