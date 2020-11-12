
class Rectangle extends Shape{
	private double  length;
	
	public Rectangle(double width, double height) {
		super(width);
		this.length = height;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public double computeArea() {
		return getWidth() * getLength();
	}
	public String toString() {
		String str = "Rectangle of sides: " + getWidth() + " Length " + getLength();
		return str;
	}
	public void run() {
		System.out.printf("%s  Area: %.2f\n", toString(), computeArea());
	}
}
