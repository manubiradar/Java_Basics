package staticBlock;

public class StudentEnroll {
	private String id, name, branch;
	private static int count;
	private static String orgname;
	public StudentEnroll(String id, String name, String branch) {
		
		this.id = id;
		this.name = name;
		this.branch = branch;
		count++;
		System.out.println("constructor invoked");
	}
	public void  showData() {
		System.out.println(id+" "+name+" "+branch+" "+count+" "+ orgname);
	}
	 static {
		 count=0;
		 orgname="IITM";
		 System.out.println("static block-1 is invoked");
	 }

}