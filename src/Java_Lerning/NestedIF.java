package Java_Lerning;

public class NestedIF {

	public static void main(String[] args) {
		int n = 363;
		int m = 20;
		if(m<0) {
			System.out.println("negative number");
		}
		else {
			if(m%2==0) {
			System.out.println("even no.");
			}
			else {
				System.out.println("odd no.");
			}
		}
//		below is assignment
		if(n%11==0) {
			System.out.println("yes, divisible by 11");

			if(n%2==0) {
			System.out.println("even no.");
			}
			else {
				System.out.println("odd no.");
			}
		}
		else {System.out.println("no. is not divisible by 11");}

	}

}
