package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] strings = {"0","1", "2", "3", "4", "5", "6"};
		stringArray(strings);
		System.out.println();
		reverseStringArray(strings);
		System.out.println();
		oddStringArray(strings);
		System.out.println();
		randomStringArray(strings);
		
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.

	public static void stringArray(String array[]) {
		for(String i : array) {
			System.out.print(i+",");
		}
	}

	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.

	public static void reverseStringArray(String array[]) {
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(i+",");
		}
	}

	//4. Write a method that takes an array of Strings and prints every other String in the array.

	public static void oddStringArray(String array[]) {
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 0) {
				System.out.print(i+",");
			}
		}
	}


	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.

	public static void randomStringArray(String array[]) {
		ArrayList<String> list = new ArrayList<>();
		Random ran = new Random();
		for(String i : array) {
			list.add(i);
		}
		while(!list.isEmpty()) {
			int ranNum = ran.nextInt(list.size());
			System.out.print(list.get(ranNum)+",");
			list.remove(ranNum);
		}
	}


}
