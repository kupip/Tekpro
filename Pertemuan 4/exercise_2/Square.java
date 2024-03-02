package exercise_2;

public class Square extends Rectangle{
	
	public Square() {
	}

	public Square(double side) {
		super(side, side); // Call superclass Rectangle(double, double)
	}
	
	public Square(double side, String color, boolean filled) {
		this.setLength(side);
		this.setWidth(side);
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getSide() {
		return this.getLength();	
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side="+ this.getLength() +
				", which is a subclass of " + super.toString();
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
}
