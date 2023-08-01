package Eception;

public class demo2 {

	public static void main(String[] args) {
		System.out.println("statement1");
		try {
//			Thread.sleep(1000);
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("statement2");

	}

}
