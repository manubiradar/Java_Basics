package Java_Lerning_loop;

public class ForLoop {

	public static void main(String[] args) {
//		printing numbers only divisible by 3 and 5
		for (int k=10;k>=0 ;k-- )
		{if ((k%3==0)||(k%5==0))
			{System.out.println(k);}}
		
		
		int row = 4;
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		int row1 = 0;
		for (int i=4;i>=row1;i--)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		 
		
	}
 
}
