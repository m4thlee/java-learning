package entities;

public class Rectangle {
	
	public double height;
	public double width;
	
	public double area() {
		return height * width;
	}
	public double perimeter() {
		return (height + width)*2;
	}
    public double diagonal() {
    	return Math.sqrt(width * width + height * height);
    }
}
