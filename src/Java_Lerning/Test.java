package Java_Lerning;

public class Test {

	public static void main(String[] args) {
		char c1 = 'c';
		char c2 = 'a';
		char c3 = 'r';
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		String greet = "Hello";
		String name = "manu biradar";
		String space = "  ";
		greet=greet.toLowerCase();
		name=name.toUpperCase();
		String msg = greet+space+name;
		System.out.println(msg);
		boolean b;
		int weight = 50;
		b = !(weight>45);
		System.out.println(b);
		boolean d;
		int weight2 = 50;
		d = weight2<=45;
		System.out.println(d);
		boolean e;
		int weight3 = 60;
		e = weight<weight3 | weight<weight2;
		System.out.println(e);
		int a = 10;
		int c = 20;
		a+=4;
		c-=4;
		System.out.println(a);
		System.out.println(c);
		
		
		int age =33;
		int wt = 7;
		if(age>=18) {
			if(wt>50) {
			System.out.println("accepted");
		}
		else {
			System.out.println("under weight");
		}
		}
		else {
			System.out.println("minor");
		}
		
		int[] x= {10,20,30,40,50};
		for (int x1:x )
		    System.out.println(x1);
		
	}

}
