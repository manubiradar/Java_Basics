package subclassingAndMethodOverRiding;

public class TestEmployee {

	public static void main(String[] args) {
    
	Manager manager= new Manager();
    manager.setName("Manu Bira");
    manager.setEmail("abc@gmail.com");
    manager.setDepartment("Testing");
    
    System.out.println(manager.getDetails());
    
    Employee employee = new Employee();
    employee.setName("Jaya Bira");
    employee.setEmail("xyz@gmail.com");
    
    System.out.println(employee.getDetails());
	
	}

}

