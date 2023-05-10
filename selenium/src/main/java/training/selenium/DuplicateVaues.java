package training.selenium;

import java.util.*;

public class DuplicateVaues {

	public static void main(String[] args) {
		int[] array = { 1,1, 2, 3, 4, 4, 5, 6, 7, 8, 8 }; //1  array[1]->1  array[] -> 1
		//input =>  1,1, 2, 3, 4, 4, 5, 6, 7, 8, 8				
		//output=> 1, 2, 3, 4, 5, 6, 7, 8
		
		for (int i = 0; i < array.length; i++) {
			// i=0+1 = 1;  2
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					array[j] = 0;

				}
			}

		}

	}

}
