// Subclass nonElektronik
public class nonElektronik extends Peralatan {
	private String state;
	private String nama;
	
	public nonElektronik(String nama) {
		this.setNama(nama);
	}
	@Override
	public void set_up() {
		System.out.println(this.nama + " sudah berhasil disiapkan.");
		setState("siap");
	}
	
	@Override
	public void merapikan() {
		System.out.println(this.nama + " berhasil dirapikan.");
		setState("rapi");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}