package staticMethods;

public class Demo {
	public static void main(String[] args) {
		StudentEnroll s1=new StudentEnroll("IT101","Manu");
		StudentEnroll s2=new StudentEnroll("IT102","Jaya");
		StudentEnroll s3=new StudentEnroll("IT103","avi");
		s1.showData();
		s2.showData();
		s3.showData();
		
		StudentEnroll.showOrgData();
		
		StudentEnroll.setOrgName("IIT Mumbai",s1);
		s1.showData();
		s2.showData();
		s3.showData();
		
		StudentEnroll.showOrgData();
		
	
}
}