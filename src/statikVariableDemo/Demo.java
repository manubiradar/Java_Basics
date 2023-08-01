package statikVariableDemo;

public class Demo {
	public static void main(String[] args) {
		StudentEnroll s1=new StudentEnroll("IT101","Manu","IT");
		StudentEnroll s2=new StudentEnroll("IT102","Jaya","IT");
		StudentEnroll s3=new StudentEnroll("IT103","avi","IT");
		s1.showData();
		s2.showData();
		s3.showData();
		System.out.println("organisation: "+StudentEnroll.ORG_NAME);
		
		CarService c1=new CarService("TATA","INDICA 2013","MH04CJ0459");
		CarService c2=new CarService("SUZUKI","SWIFT 2010","MH04DJ8127");
		CarService c3=new CarService("SUZUKI","DZIRE 2013","MH04FZ5157");
		c1.showStatus();
		c2.showStatus();
		c3.showStatus();
	}
}