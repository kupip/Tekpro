public class Workout {
	/*Attributes*/
	private int duration;
	private String type;
	
	/*Methods*/
	Workout() {	
	} // constructor
	
	// fungsi untuk mengembalikan nilai durasi
	public int getDuration() {
		return duration;
	}
	
	// fungsi untuk mengisi variabel durasi
	public void setDuration(int d) {
		this.duration = d;
	}

	// fungsi untuk mengembalikan nilai tipe olahraga
	public String getType() {
		return type;
	}

	// fungsi untuk mengisi tipe olahraga
	public void setType(String type) {
		this.type = type;
	}
	
	// fungsi untuk menampilkan jenis dan durasi olahraga
	public void display() {
		System.out.println("Your workout type is " + this.type + ", and you do it for " + this.duration + " minutes.");
	}
	
	// fungsi untuk memberikan apresiasi atau memberi semangat
	public void check() {
		if (this.duration >= 30) {
			System.out.println("Congratulations for your hardwork!");
		} else {
			System.out.println("Let's do more, you can do that!");
		}
	}
}