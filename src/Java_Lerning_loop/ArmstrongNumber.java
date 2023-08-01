package Java_Lerning_loop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Iterate through all 3-digit numbers
	    for (int i = 100; i < 1000; i++) {
	      int a = i / 100;
	      int b = (i / 10) % 10;
	      int c = i % 10;

	      // Check if the number is an Armstrong number
	      if (a*a*a + b*b*b + c*c*c == i) {
	        System.out.println(i);
	      }
	    }

	}

}
