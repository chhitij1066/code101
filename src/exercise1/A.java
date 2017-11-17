package exercise1;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		System.out.println(obj1.numberOfDigits(obj1.n));
		
		// compare if the digits of x is less than or equal to n
		

	}
	
	// state or attributes
	int n;
	int x;
	
	// Constructors
	A(){
		n = 1943;
		x = 13;
	}
	
	public void extractEvenOrOdd(){
		for(int i=x;i<=n;i+=2){
			// this part of the program provides the values that needs to be filtered
			
			
		}
	}
	
	// extract digits out of a VALUE
	public void ext(int value){
		// find out how many digits are there in the value
		this.numberOfDigits(value);
		
		// extract all the digits one by one
		// n digit -> (n-1)Zeroes
	}
	
	// extract the nth digit from the value
	public void extractNthValue(){
		
	}
	
	// return the number of digits in the value
	public int numberOfDigits(int value){
		int numberOfDigits = 0;
		int a = 1;
		for(int i = 1; value > a; i++){
			a = a*10;
			numberOfDigits = i;
		}
		return numberOfDigits;
	}

}
