package training.selenium;
import java.util.*;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)  // i=3
			{
			System.out.print(j);
			System.out.print("\t");
		
			} 
			System.out.println("");

		}
		System.out.println("\t");
		//star();
	}
	
	
	public static void star()
	{
		int k=1;
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		//System.out.println( "outer loop started");
		for(int j=1;j<=4-i;j++) // inner loop
		{
		System.out.print("*");
		System.out.print("\t");
		k++;
		}
		System.out.println( "");
		}
	}

}
