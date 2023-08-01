package staticMethods;

public class StudentEnroll {
	private String id, name;
	public static int count;
	public static String ORG_NAME="IITB";
	public StudentEnroll(String id, String name) {
		
		this.id = id;
		this.name = name;
		count++;
	}
	public void showData() {
		System.out.println(id+" "+name+" "+ORG_NAME);
	}
	public static void setOrgName(String org,StudentEnroll s) {
		ORG_NAME=org;
		s.id="newid";
	}
	public static void showOrgData() {
		System.out.println("\nORGANISATION DATA");
		System.out.println("NAME:"+ORG_NAME);
		System.out.println("Total Students Enrolled:"+count);
		
	}
	

}
