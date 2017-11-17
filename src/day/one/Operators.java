package day.one;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators a = new Operators();
		a.add();
		a.div();
		a.mod();
		a.mul();
		a.subtract();
		a.displayFloatValue();
	}
	
	// states of the object
	
	public float floatVal;
	
	public byte a;
	public byte b;
	
	public byte res_add;
	public byte res_sub;
	public float res_div;
	public int res_mul;
	public byte res_mod;
	
	// Constructors
	public Operators(){
		a = 1;
		b = 3;
		floatVal = 1234567856.555555f;
	}
	
	// METHODS
	
	// displays the value of floatVal
	public void displayFloatValue(){
		System.out.println("the value of the variable \"floatVal\" is : " + floatVal);
	}
	
	// adds "a" and "b" and displays the result
	public void add(){
		this.res_add = (byte) (this.a + this.b);
		System.out.println("the sum is : " + res_add);
	}
	
	public void subtract(){
		this.res_sub = (byte) (this.a - this.b);
		System.out.println("the result when b is subtracted from a :" + res_sub);
	}
	
	public void mul(){
		this.res_mul = this.a * this.b;
		System.out.println("The multiplication result is: " + res_mul);
	}
	
	public void div(){
		this.res_div = (float) this.a / this.b;
		System.out.println("The division result is: " + res_div);
	}
	
	public void mod(){
		this.res_mod = (byte) (this.a % this.b);
		System.out.println("The modular result is: "+res_mod);
	}

}
