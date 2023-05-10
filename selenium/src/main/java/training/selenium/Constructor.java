package training.selenium;

public class Constructor {
	public  String db = "1";
	public int a,b;
	
	public Constructor(int a,int b) {
		System.out.println("this is Constructor of parent class");
		this.a = a; 
		this.b=b;
	}
	
	public void sum() {
		int c= a+b;
		System.out.println(c);
	}
	
	public void subtract () {
		int c= b-a;
		System.out.println(c);
	}
	
	public void mul () {
		int c= b*a;
		System.out.println(c);
	}
	
	
	
	
}
