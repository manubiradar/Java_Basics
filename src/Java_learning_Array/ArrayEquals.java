package Java_learning_Array;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
		int[] array2 = {3, 2, 1};
		Arrays.sort(array2);
String a = Arrays.toString(array1);
String b = Arrays.toString(array2);
		if (Arrays.equals(array1, array2)) {
		  System.out.println("The arrays are equal.");
		} else {
		  System.out.println("The arrays are not equal.");
		}
System.out.println(a+" "+b);
// we have to convert arrays to string to print their values

		System.out.println(array1+" "+array2);
	}

}
