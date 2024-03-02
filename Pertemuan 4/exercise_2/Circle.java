package exercise_2;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		this.setRadius(1.0);
	}
	
	public Circle(double radius) {
		this.setRadius(radius);
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.setRadius(radius);
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius=" + radius +
				", which is a subclass of " + super.toString();
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}