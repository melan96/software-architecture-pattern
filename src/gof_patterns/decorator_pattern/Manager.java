package decorator_pattern;

public class Manager extends Employee{

	@Override
	public  double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+80000;
	}

}
