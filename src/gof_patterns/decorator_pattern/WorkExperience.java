package decorator_pattern;

public class WorkExperience extends EmployeeQualification {

	Employee emp;
	double salary; 
	
	
	public WorkExperience(Employee emp) {
		super();
		this.emp = emp;
		this.salary=emp.getSalary()+20000;
	}

	
	
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println("WorkExperience employee ");
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
