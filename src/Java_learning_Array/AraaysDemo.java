package Java_learning_Array;

import java.util.Arrays;

public class AraaysDemo {

	public static void main(String[] args) {
		int marks[] = {2,7,5,4,8};
//		Arrays.sort(marks);    // sorting line
//		Arrays.fill(marks, 6);  // fill
		int marksCopy[];                      //copy array
//		marksCopy = Arrays.copyOf(marks, 5);  //copy command
		marksCopy = Arrays.copyOfRange(marks, 1, 5); //range command where 1 is index 5 is position
		String mStr = Arrays.toString(marksCopy);
		System.out.println(mStr);

	}

}
