import java.util.ArrayList;

public class Shapes{

	private ArrayList<Shape> shapeList;
	
	public Shapes() {
		shapeList = new ArrayList<>();
	}
	
	public Shapes(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	public void add(Shape shape) {
		shapeList.add(shape);
	}
	public void remove(Shape shape) {
		shapeList.remove(shape);
	}
	
	
	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	public ArrayList<Shape> getShapeList(){
		return shapeList;
	}
	synchronized public void compute() {
		System.out.println("Shape List:");
		for (Shape s: shapeList) {
			s.start();
		}
	}
	public Shape max() {
		double maxArea = -1;
		Shape maxShape = null;
		
		for (Shape s: shapeList) {
			if (s.computeArea() > maxArea) {
				maxArea = s.computeArea();
			maxShape = s;
			}
		}
		return maxShape;
	}
	public Shape min() {
		double minArea = 1000000;
		Shape minShape = null;
		
		for (Shape s: shapeList) {
			if (s.computeArea()< minArea) {
				minArea = s.computeArea();
				minShape = s;
			}
		}
		return minShape;
	}
   }


