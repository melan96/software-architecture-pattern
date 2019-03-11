package decorator_pattern;

public class Consultant extends Employee {

	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+70000;
	}

}
