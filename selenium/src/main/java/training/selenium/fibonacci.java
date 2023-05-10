package training.selenium;

public class fibonacci {

	public static void main(String[] args) {
		int a=0, b=1, count=10, c=0;
		while (count > 0) {
			System.out.println(" "+ c);
			a=b;
			b=c;
			c=a+b;
			count--;
		}

	}

}
