package Java_learning_Array;

public class Array {

	public static void main(String[] args) {
		int rainfall[]= {25,23,25,24,26,24,25,25};
		rainfall[3]= 33;
		System.out.println(rainfall[3]);
		int sq[]=new int[10];
		int n,x;
		for (x=0;x<10;x++) {
			n=x+1;
			sq[x]=n*n;
			System.out.println(x+"  "+n);
			System.out.println(sq[x]);
		}
		System.out.println(sq[5]);
		
		

	}

}
