import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes shapes = new Shapes();
		
		shapes.add(new Rectangle(10, 20));
	    shapes.add(new Rectangle(5, 9));
	    shapes.add(new Triangle(6, 10));
	    shapes.add(new Triangle(5, 9));
	    shapes.add(new Circle(3.5));
	    shapes.add(new Circle(6));
		shapes.add(new Hexagon(12.0));
	    shapes.add(new Hexagon(5.0));
        
        shapes.compute();
        
        try {
        	Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
        	Logger.getLogger(ShapeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\nMax: \n" + shapes.max().toString());
        System.out.println("\nMin: \n" + shapes.min().toString());
        
        ArrayList<Shape> shapeList = shapes.getShapeList();
        
        for (int i = 0; i< shapeList.size(); i++) {
        	try {
        		FileOutputStream fout = new FileOutputStream("obj" + (i + 1) + ".ser");
        		ObjectOutputStream oos = new ObjectOutputStream(fout);
        		oos.writeObject(shapeList.get(i));
        		fout.close();
        	}
        	catch (IOException e) {
        		
        	}
        }     
    }
}
