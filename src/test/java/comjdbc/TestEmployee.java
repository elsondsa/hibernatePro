package comjdbc;

import org.junit.Test;


public class TestEmployee {

	@Test
	public void test() {
		Laptop laptop=new Laptop();
		laptop.setId(101);
		laptop.setName("Dell");
		Laptop laptop2=new Laptop();
		laptop2.setId(102);
		laptop2.setName("Inspiron");
		Laptop laptop3=new Laptop();
		laptop3.setId(103);
		laptop3.setName("Asus");
		EmployeeName ename=new EmployeeName();
		ename.setFname("Ramachandra");
		ename.setLname("Guha");
		ename.setMname("Reddy");
		

		
		Employee emp = new Employee();
		emp.setName(ename);
		emp.setSalary(10000);
		emp.getLaptop().add(laptop);
		emp.getLaptop().add(laptop2);
		emp.getLaptop().add(laptop3);
		EmployeeRepo repo = new EmployeeRepo();
		repo.addEmployee(emp,laptop,laptop2,laptop3);
		//emp=repo.fetchEmployee(emp, 1);
		//System.out.println(emp);
	}

}