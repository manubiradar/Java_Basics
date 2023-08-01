package Java_Lerning;

public class TernaryOperator {

	public static void main(String[] args) {
		int n,nHalf;
		n=8;
		nHalf=n%2==0?n/2:(n+1)/2;
		System.out.println(nHalf);
		int a =20;
		int b =10;
		int min=(a>b)?a:b;
		System.out.println(min);
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println(max);

	}

}
