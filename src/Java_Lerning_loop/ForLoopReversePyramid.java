package Java_Lerning_loop;

public class ForLoopReversePyramid {

	public static void main(String[] args) {
		int row = 4;
		for (int i=0;i<row;i++)
		{
			for (int j=4;j>i;j--)
			{
				for (int k=0;k<i&j>3;k++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
