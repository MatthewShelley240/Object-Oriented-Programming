
public class Exercise_09_01 {

	public static void main(String[] args) {

		// Calls the rectangle class.
		Rectangle rect1 = new Rectangle();

		// Prints the default rectangle
		System.out.println("The area of the default rectangle is " + rect1.getArea());
		System.out.println("The perimeter of the default rectangle is " + rect1.getPerimeter());
		System.out.println("\n");
		
		// Rectangle with height 40 and width 4
		Rectangle rect2 = new Rectangle(40, 4);
		
		// Prints the Rectangle where height = 40 and width = 4.
		System.out.println("If the height = " + 40 + " and the width = " + 4 + " then the area = " + rect2.getArea());
		System.out.println("If the height = " + 40 + " and the width = " + 4 + " then the permiter = " + rect2.getPerimeter());
		System.out.println("\n");
		
		// Rectangle with height 35.9 and width 3.5
		Rectangle rect3 = new Rectangle(35.9, 3.5);
		
		// Prints the Rectangle where height = 35.9 and width = 3.5
		System.out.println("If the height = " + 35.9 + " and the width = " + 3.5 + " then the area = " + rect3.getArea());
		System.out.println("If the height = " + 35.9 + " and the width = " + 3.5 + " then the permiter = " + rect3.getPerimeter());
		
	}

}
