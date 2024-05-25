package _01_Simple_Array_Algorithms;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

	

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	public void stringArray(String array[]) {
		for(String i : array) {
			System.out.println(i);
		}
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

	public void reverseStringArray(String array[]) {
		for(int i = array.length-1; i >= 0; i--) {
			System.out.println(i);
		}
	}

    //4. Write a method that takes an array of Strings and prints every other String in the array.

	public void oddStringArray(String array[]) {
		for(int i = 0; i < array.length; i++) {
			
		}
	}
	

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
