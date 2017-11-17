package day3.homework.project1;

public class Triangle {
	
	// Calculate Perimeter using sides
	public long calculatePerimeter(int sideA, int sideB, int sideC){
		long perimeter = sideA + sideB + sideC;
		return perimeter;
	}
	
	// Calculate Area
	public float calculateArea(int height, int base){
		float area = (height * base) / 2;
		return area;
	}
	
}
