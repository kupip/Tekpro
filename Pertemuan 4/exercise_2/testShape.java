package exercise_2;

public class testShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testSuperMethod(); 
//		testCircleMethod();
//		testRecMethod();
		testSquareMethod();
	}
	
	public static void testSuperMethod() {
		Shape aShape1 = new Shape();
		Shape aShape2 = new Shape("khaki", false);
		
		System.out.println("aShape1 color: " + aShape1.getColor());
		System.out.println("aShape2 color: " + aShape2.getColor());
		aShape1.setColor("blue");
		aShape2.setColor("orange");
		System.out.println("aShape1 color: " + aShape1.getColor());
		System.out.println("aShape2 color: " + aShape2.getColor());
		
		System.out.println();
		System.out.println("aShape1 is "+(aShape1.isFilled()?"filled.":"not filled."));
		System.out.println("aShape2 is "+(aShape2.isFilled()?"filled.":"not filled."));
		aShape1.setFilled(false);
		System.out.println("aShape1 is "+(aShape1.isFilled()?"filled.":"not filled."));
		System.out.println(aShape2.toString());
	}
	
	public static void testCircleMethod() {
		Circle aCircle1 = new Circle(14, "olive", false);
		System.out.println("Circle area=" + aCircle1.getArea());
		System.out.println(aCircle1.toString());
	}
	
	public static void testRecMethod() {
		Rectangle aRec = new Rectangle(5, 4);
		System.out.println("Rectangle  area=" + aRec.getArea() + " Rectangle perimeter= " + aRec.getPerimeter());
		System.out.println(aRec.toString());		
	}
	
	public static void testSquareMethod() {
		Square aSquare = new Square(16);
		System.out.println("Square  area=" + aSquare.getArea() + " Rectangle perimeter= " + aSquare.getPerimeter());
		System.out.println(aSquare.toString());
	}
}
