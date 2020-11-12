import java.io.Serializable;

public abstract class Shape extends Thread implements Serializable{
	private double width;
	protected Shape (double width) {
		setWidth(width);
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
    public abstract double computeArea();
	
}
