// Superclass
package teori;

import java.util.UUID;

public abstract class Peralatan {
	private UUID id;
	public abstract void set_up();
	public abstract void merapikan();
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID uuid) {
		this.id = uuid;
	}
}