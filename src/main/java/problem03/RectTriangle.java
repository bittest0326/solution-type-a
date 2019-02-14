package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
	}

	@Override
	public double getArea() {
		double gA = (width*height)/2;
		System.out.println("");
		return gA;
	}

	@Override
	public double getPerimeter() {
		double w=width;
		double h=height;
		double L= Math.sqrt(w*w+h*h);
		double lengh = w+h+L;
		return lengh;
	}
}
