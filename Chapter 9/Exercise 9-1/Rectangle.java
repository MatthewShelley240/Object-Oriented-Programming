
public class Rectangle {
	private double height;
	private double width;

	//creates the default rectangle object
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	Rectangle(double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
	
	// returns the area of a rectangle
	double getArea() {
		return height * width;
	}

	// returns the perimeter of a rectangle
	double getPerimeter() {
		return ((height* 2) + (width * 2));
	}

}
