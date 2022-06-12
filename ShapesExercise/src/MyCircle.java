

/*
 *
 * MyCircle
 *
 */

public class MyCircle extends MyShape implements Computable
{

	//
	// ToDo:
	//
	// Add a constructor which takes ONLY 1 argument1: radius
	// THATS 1 ARGUMENTS NOT 2 !
    // You can pass it into the superclass constructor twice
    MyCircle(double radius){
        super(radius,radius);

    }
    //
	// ToDo:
	//
	// Implement the calculateArea() method defined in the superclass.
	//
	//
    public double calculateArea(){
        return Math.PI*radius*radius;

    }


    @Override
    public String toString() {
        return super.toString()+"Circle ,"+"& My area is "+ calculateArea();
    }
}
