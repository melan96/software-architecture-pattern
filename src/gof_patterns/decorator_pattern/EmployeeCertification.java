package decorator_pattern;

public class EmployeeCertification extends EmployeeQualification {

	Employee emp;
	double salary;
	public EmployeeCertification(Employee emp) {
		
		this.emp = emp;
		salary = emp.getSalary()+30000;
	}

	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
