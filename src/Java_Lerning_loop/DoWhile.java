package Java_Lerning_loop;

public class DoWhile {

	public static void main(String[] args) {
		int n=1;
		do {
			System.out.println(n);
			n++;
		} while (n<=10);
		
		
		
//		 find whether exact square
		int m=25;
		int x=0;
		do {
			System.out.println(x);
			x++;
		}while(x*x<=m);
		System.out.println(x);
		System.out.println(x*x==m);
		
		
		
		
//		Given a binary number, find out its decimal equivalent
//		   Eg. 11010 => 26
		int nBin = 11010;
		int nDec = 0;
		int Pow2 = 1;
		while (nBin > 0) {
			nDec = nDec + (Pow2 * (nBin % 10));
			Pow2 = Pow2 * 2;
			nBin = nBin / 10;
		}
		System.out.println(nDec);
				

	}

}
