package day3.homework.project1;

public class Rectangle {
	
	// Calculate Perimeter
	public long calculatePerimeter(int length, int width){
		long perimeter = (long)(2 * (length+width));
		return perimeter;
	}
	
	// Calculate Area
	public long calculateArea(int length, int width){
		long area = length * width;
		return area;
	}
}
