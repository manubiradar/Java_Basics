package Java_learning_Array;

public class SumOfArray {

	public static void main(String[] args) {
		int[] array = {5, 2, 3, 4, 5};
	    int sum = 0;

	    // Iterate through the array and sum the elements
	    for (int i = 0; i < array.length; i++) {
	      sum += array[i];
	    }

	    System.out.println(sum);

	}

}
