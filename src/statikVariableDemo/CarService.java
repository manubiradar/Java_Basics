package statikVariableDemo;

public class CarService {
	private String model, make , reg_no;
	public static int count=0;
	public static final String SERVICE_CENTRE_NAME="FORTPOINT";
	public CarService(String make, String model, String reg_no) {
		this.model = model;
		this.make = make;
		this.reg_no = reg_no;
		count++;
	}
	public void showStatus() {
		System.out.println(make+" "+model+" "+reg_no+" "+count+"  at "+SERVICE_CENTRE_NAME);
	}
	

}