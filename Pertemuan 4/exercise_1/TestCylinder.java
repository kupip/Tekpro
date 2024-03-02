package exercise_1;

public class TestCylinder { // save as "TestCylinder.java"
	 public static void main (String[] args) {
		 Cylinder c1 = new Cylinder();
		 System.out.println("Cylinder:"
		 + " radius=" + c1.getRadius()
		 + " height=" + c1.getHeight()
		 + " surface area=" + c1.getArea()
		 + " volume=" + c1.getVolume());
		 System.out.println(c1.toString());
		 
		 Cylinder c2 = new Cylinder(10.0);
		 System.out.println("Cylinder:"
		 + " radius=" + c2.getRadius()
		 + " height=" + c2.getHeight()
		 + " surface area=" + c2.getArea()
		 + " volume=" + c2.getVolume());
		 
		 Cylinder c3 = new Cylinder(2.0, 10.0);
		 System.out.println("Cylinder:"
		 + " radius=" + c3.getRadius()
		 + " height=" + c3.getHeight()
		 + " surface area=" + c3.getArea()
		 + " volume=" + c3.getVolume());
	 }
}