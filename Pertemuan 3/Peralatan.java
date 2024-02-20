// Superclass
public abstract class Peralatan {
	private String id;
	public abstract void set_up();
	public abstract void merapikan();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}