package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
	}

	@Override
	public void resize(double rate) {
	}

	@Override
	public double getArea() {
		double gA = width*height;
		return gA;
	}

	@Override
	public double getPerimeter() {
		double w=width;
		double h=height;
		double lengh = (w+h)*2;
		return lengh;
	}
}