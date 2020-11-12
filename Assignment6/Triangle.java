class Triangle extends Shape {
	private double height;
	public Triangle(double width, double height) {
		super(width);
		this.height = height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double computeArea() {	
		return (getWidth() * getHeight())/2;	
	}
	public String toString() {
		String str = "Triangle with sides: " + getWidth() + " , " + getHeight();
		return str;
		
	}
	public void run() {
		
		System.out.printf("%s  Area: %.2f\n", toString(), computeArea());
	}
	
}
