package day2.homework.project1;

import java.util.Scanner;

public class MultiplyEvenNumber {
	
	// ATTRIBUTES:
	
	int initialValue;
	int finalValue;
	int method;
	long multResult;

	public static void main(String[] args) {
		
		MultiplyEvenNumber a = new MultiplyEvenNumber();
		
		// feed the initial value
		System.out.print("Please enter the first Number of the range : ");
		Scanner initialValue = new Scanner(System.in);
		a.initialValue = initialValue.nextInt();
		
		// feed the final value
		System.out.print("Please enter the last Number of the range : ");
		Scanner finalValue = new Scanner(System.in);
		a.finalValue = finalValue.nextInt();
		
		// find out what method do you want to use
		System.out.print("Type 0 to use For loop or Type any other number to use While Loop : ");
		Scanner methodName = new Scanner(System.in);
		a.method = methodName.nextInt();
		
		if(a.method == 0){
			System.out.println("You chose FOR LOOP for the task at hand");
			// call FOR LOOP method
			a.usingForLoop();
		}else{
			System.out.println("You chose WHILE LOOP for the task at hand");
			// call WHILE LOOP method
			a.usingWhileLoop();
		}
	}
	
	// METHODS
	
	public void usingForLoop(){
		multResult = 1;
		System.out.println("The Initial Value is : " + initialValue);
		System.out.println("The Final Value is : " + finalValue);
		if(initialValue % 2 != 0){
			initialValue ++;
		}
		for(int i=initialValue; i<=finalValue; i+=2){
			multResult = i * multResult;
		}
		System.out.println("The Multiplication of all the even numbers in between " + initialValue + " and " + finalValue + " is : " + multResult);
	}
	
	public void usingWhileLoop(){
		multResult = 1;
		System.out.println("The Initial Value is : " + initialValue);
		System.out.println("The Final Value is : " + finalValue);
		
		if(initialValue % 2 != 0){
			initialValue++;
		}
		int currentValue = initialValue;
		while(currentValue<=finalValue){
			System.out.println(currentValue);
			multResult = multResult * currentValue;
			currentValue += 2;
		}
		System.out.println("The Multiplication of all the even numbers in between " + initialValue + " and " + finalValue + " is : " + multResult);
	}

}
