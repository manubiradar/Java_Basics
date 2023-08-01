package creating;

public class TestStudent {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		s2.name="avi";
		s2.roll_no=2;
		s3.name="abhi";
		s3.roll_no=3;
		
		System.out.println("s1 contains  "+s1.name+" "+s1.roll_no);
		System.out.println("s2 contains  "+s2.name+" "+s2.roll_no);
		System.out.println("s3 contains  "+s3.name+" "+s3.roll_no);
	}

}
