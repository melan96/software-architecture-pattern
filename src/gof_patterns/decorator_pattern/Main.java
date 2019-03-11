package decorator_pattern;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Engineer();
		employee = new WorkExperience(employee);
		employee = new EmployeeCertification(employee);
		System.out.println("Employee gets  :  "+employee.getSalary());
		
	}
}
