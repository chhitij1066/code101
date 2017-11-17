package day3.homework.project1;

public class AreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec1 = new Rectangle();
		// calculate area
		System.out.println(rec1.calculateArea(10, 33));
		// calculate perimeter
		System.out.println(rec1.calculatePerimeter(10, 33));
		
		Triangle tri1 = new Triangle();
		// calculate area
		System.out.println(tri1.calculateArea(10, 13));
		// calculate perimeter
		System.out.println(tri1.calculatePerimeter(10, 13, 15));

	}

}
