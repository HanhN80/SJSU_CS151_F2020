
class Hexagon extends Shape{
	
	public Hexagon(double width) {
		super(width);
	}
	public double computeArea() {
		return ((3*Math.sqrt(3))/2) * Math.pow(getWidth(), 2);
	}
	public String toString() {
		String str = "Hexagon of sides: " + getWidth();
		return str;
	}
	public void run() {
		System.out.printf("%s  Area: %.2f\n", toString(), computeArea());
	}
}
