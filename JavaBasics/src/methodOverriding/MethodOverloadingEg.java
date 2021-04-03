package methodOverriding;

public class MethodOverloadingEg {
    int add(int a, int b) {
    	return a+b;
    }
    int add(int a, int b, int c) {
    	return a+b+c;
    }
    void add(int a,String b) {
    	System.out.println("3rd = "+a+b);
    }
    void add(String a,int b,int c) {
    	System.out.println("4th = "+a+b*c);
    }
    void add(double a, int b) {
    	System.out.println("5th ="+a+b);
    }
    void add(String a,int b) {
    	System.out.println("6th = "+a+b);
    }
   public static void main(String[] args) {
	    
	 MethodOverloadingEg mo = new MethodOverloadingEg();
	 int add1 = mo.add(10,20);
	 System.out.println("1st - "+add1);
	 int add2 = mo.add(40, 50, 10);
	 System.out.println("2nd = "+add2);
	 mo.add(5, "Sara");
	 mo.add("Yazz", 4,5);
	 mo.add(40.5,5);
	 mo.add("Hendry", 7);
	 }
  }
