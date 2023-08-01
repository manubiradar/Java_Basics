package creating;

public class Employee {
	String ename;
	int id;
	Employee (String name,int id) {
		this.ename=name;
		this.id=id;
	}

	public static void main(String[] args) {
		Employee e1= new Employee("manu ",1);
		Employee e2= new Employee("manoj ",2);
		System.out.println(e1.ename+e1.id);
		System.out.println(e2.ename+e2.id);

	}

}
