package training.selenium;

public class Loop {

	public static void main(String[] args) {
		whileLoop();
		//doLoop();
		//table();

	}
	
	
	public static void doLoop()
	{
		int j=20;
		do
		{
		System.out.println(j);
		j++;

		}while(j<30);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void table() {
		for (int i=1; i < 10; i++) {
			System.out.println(i*2);   // 11*2
		}
		
	}
	
	
	public static void whileLoop()
	{
		int i = 5;
		while(i>0) {
		 System.out.println(i);
		 i--;  //i=2
		}
	}
	
	
}
