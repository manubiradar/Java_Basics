package callingMethodsOfTheSuperclass;

public class TestEmployee {

	public static void main(String[] args) {
		Manager manager = new Manager("manu bira","abc @gmail.com","Testing");
		Employee employee =new Employee("jaya bira","xyz@gmail.com");
		
		System.out.println(manager.getDetails());
		System.out.println(employee.getDetails());
	}

}
