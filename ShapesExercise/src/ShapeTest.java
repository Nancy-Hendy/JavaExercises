

public class ShapeTest
{

		public static void main(String[] args) {
			// Create a polymorphic array of
			// four MyShape objects - some of which are
			// MyRectangles and others are MyCircles.
			MyShape[] myShapes = {
					new MyRectangle(200,200),
					new MyCircle(100),
					new MyRectangle(100,50),
					new MyCircle(50),
					new MyTriangle(12,20)
			};
			 MyTown town = new MyTown();
			 town.calculateTownArea(7000,6000);



			Computable[] computables={
					new MyRectangle(12,40),
					town,
					new MyCircle(30)

			};

			//
			// ToDo:
			//
			// Print calculated area of every shape in the above array
			for(int i=0; i< myShapes.length;i++){
				System.out.println(myShapes[i]);
			}
			for(int j=0; j< computables.length;j++){
				System.out.println(computables[j]);
			}

		}

	}

