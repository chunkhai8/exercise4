package ArrayOneDimensional;

import java.util.*;
public class exercise3 {
	
	public static void main(String[] args) {
		
		//write a program that create an array of 10 element size. ur prog should promt tha users to import numbers in array
		//display the sum of all array element
			
		int[] numbers = new int[10];
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum numbers = "+ sum);
		
		in.close();
	}

}
