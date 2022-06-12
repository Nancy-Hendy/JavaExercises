import java.awt.*;

/*
 *
 * MyShape
 *
 */

public abstract class MyShape {
	// Instance variables for width and height of a shape.
	// Note use of protected modifier to allow direct access by a subclass
	//
	protected double width, height, radius;


	//
	// ToDo:
	//
	// Add a Constructor. This should initialise all of
	// the instance variables to the values passed in.
	//
	MyShape(double dimension1, double dimension2) {
		this.height=dimension1;
		this.width=dimension2;
		this.radius=dimension1;
		this.radius=dimension2;

	}


	//
	// ToDo:
	//
	// Add an abstract calculateArea method which does not take any parameters.
	// This will force all subclasses of MyShape to implement this method
	// This method will return the area of a shape, choose a suitable return type
	//abstract double calculateArea();

	public String toString() {
		return "I am a ";

	}
}



