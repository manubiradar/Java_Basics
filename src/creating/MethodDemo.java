package creating;

public class MethodDemo {
//	public int displayMessage() {
		
	void displayMessage() {
		System.out.println("Hello Method");
		square(4);
//		return 7;
	}
	public void  square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		MethodDemo md= new MethodDemo();
		md.displayMessage();
		//System.out.println(md.displayMessage());

}
}