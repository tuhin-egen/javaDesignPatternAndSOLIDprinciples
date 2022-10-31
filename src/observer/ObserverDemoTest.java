package observer;

public class ObserverDemoTest {

	public static void main(String[] args) {
		Office office = new Office();
		
		Observer emp1 = new Employee("Employee-1");
		Observer emp2 = new Employee("Employee-2");
		Observer emp3 = new Employee("Employee-3");
		Observer emp4 = new Employee("Employee-4");
		
		office.register(emp1);
		office.register(emp2);
		office.register(emp3);
		office.register(emp4);
		
		
		emp1.setSubject(office);
		emp2.setSubject(office);
		emp3.setSubject(office);
		emp4.setSubject(office);
		
		emp1.update();
		
		office.postMessage("Tomorrow is public holiday");

	}

}
