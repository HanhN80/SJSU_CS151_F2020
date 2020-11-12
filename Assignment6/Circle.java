
class Circle extends Shape{
	
	double pi = Math.PI;

	public Circle(double width) {
		super(width);
	}
	
	public double computeArea() {
     //	area = pi*radius ^ 2	
		return pi * Math.pow(getWidth(), 2);	
	}
	public String toString() {
		String str = "Circle of radius: " + getWidth();
		return str;
	}
	public void run() {
		System.out.printf("%s  Area: %.2f\n", toString(), computeArea());
	}
}
