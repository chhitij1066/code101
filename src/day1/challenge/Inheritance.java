package day1.challenge;

public class Inheritance {

	public static void main(String[] args){
		A obja = new A();
		obja.say();
		obja.sing();
		
		B objb = new B();
		objb.sing();
		objb.say();
		objb.classASing();
		
		// parent A, child B
		A obj1 = new B();
		obj1.sing();
		obj1.say();
		
		obj1 = new C();
		obj1.say();
		
	}

}
