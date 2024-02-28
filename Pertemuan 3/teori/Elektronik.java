// Subclass Elektronik
package teori;
import java.util.UUID;

public class Elektronik extends Peralatan{
	private boolean turned_on;
	private String nama;
	
	public Elektronik(String nama) {
		this.setNama(nama);
		this.setId(UUID.randomUUID());
	}
	
	@Override
	public void set_up() {
		// TODO Auto-generated method stub
		System.out.println(this.nama + " berhasil disiapkan.");
		setTurned_on(true);
	}
	
	@Override
	public void merapikan() {
		// TODO Auto-generated method stub
		System.out.println(this.nama + " dimatikan dan dirapikan.");
		setTurned_on(false);
	}

	public boolean isTurned_on() {
		return turned_on;
	}

	public void setTurned_on(boolean turned_on) {
		this.turned_on = turned_on;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
}