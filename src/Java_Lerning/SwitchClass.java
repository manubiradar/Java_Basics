package Java_Lerning;

public class SwitchClass {

	public static void main(String[] args) {
		int gen = 1;
		int day =1;
		String greet = "";
		String name = "Manohar";
		String dName = "";
		switch (gen) {
		case 1:
			greet = "Hello Mr.";
			break;
		case 2:
			greet = "Hello Ms.";
			break;
		}
		switch (day) {
		case 0:
			dName="Sunday";
			break;
		case 1:
			dName="Monday";
			break;
		case 2:
			dName="Teusday";
			break;
		case 3:
			dName="Wednesday";
			break;
		case 4:
			dName="Thursday";
			break;
		case 5:
			dName="Friday";
			break;
		case 6:
			dName="Saturday";
			break;
			default:
				dName="wrong choice";
		}
		System.out.println(greet + name + " it's " + dName);

	}

}
