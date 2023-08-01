package Java_Lerning_loop;

public class ForLoopSpacePyramid {

	public static void main(String[] args) {
		int row = 4;
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<=i;j++)
			{
				for (int k=3;k>i&j<1;k--)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
