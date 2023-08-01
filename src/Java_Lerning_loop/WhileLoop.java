package Java_Lerning_loop;

public class WhileLoop {
//	while (loop condition) {
		// do something
		// with loop variable
//}

	public static void main(String[] args) {
		int n = 50;
		while (n>=40) {
			System.out.println(n);
			n--;
		}

		
		
		
		
		
//		reverse number
		int m=12345;
		int dSum = 0;
		while (m>0) {
			dSum = (dSum*10) + (m % 10);
			m = m/10;	
//			System.out.println(dSum);
		}
		System.out.println(dSum);
		
		int num = 12345;
		int reversed = 0;

		while (num != 0) {
		    int digit = num % 10;
		    reversed = reversed * 10 + digit;
		    num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
		
		
		
		
		
//		printing math tables 1 to 10
		int a,b,c,d,e,f,g,h,i,j;
		a=1;
		b=2;
		c=3;
		d=4;
		e=5;
		f=6;
		g=7;
		h=8;
		i=9;
		j=10;
		while (a<11)
		while (b<21)
		while (c<31)
		while (d<41)
		while (e<51)
		while (f<61)
		while (g<71)
		while (h<81)
		while (i<91)
	    while (j<101)
		{
			System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f+"  "+g+"  "+h+"  "+i+"  "+j);
			a=a+1;
			b=b+2;
			c=c+3;
			d=d+4;
			e=e+5;
			f=f+6;
			g=g+7;
			h=h+8;
			i=i+9;
			j=j+10;
			
		}
		
		
	}

}
