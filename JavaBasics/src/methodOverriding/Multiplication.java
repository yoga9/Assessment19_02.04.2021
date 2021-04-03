package methodOverriding;

public class Multiplication {
	public static void main(String[] args) {
		A obj = new A();
		int A1 = obj.multiply(10, 3, 3, 10, 10);
		System.out.println("The class A - "+A1);
		
		B obj1 = new B();
		int B1 = obj1.multiply(4, 6);
		int B2 = obj1.multiply(6, 6, 6);
		System.out.println("The class B method1- "+B1+ " " +"The class B method2- "+B2);
		
		Multiplication m = new Multiplication();
		int M = m.multiply(10, 3, 3, 5);
		System.out.println("The Multiplication class -"+M);
	}
int multiply(int a, int b, int c, int d) {
    	return (a*b*c*d);
    }
}

class A extends Multiplication{
	int multiply(int a, int b, int c, int d, int f) {
		return (a*b*c*d*f);
    }
}

class B extends Multiplication{
	int multiply(int a, int b) {
		return (a*b);
}
	int multiply(int a, int b, int c) {
		return (a+b+c);
	}
}
	 