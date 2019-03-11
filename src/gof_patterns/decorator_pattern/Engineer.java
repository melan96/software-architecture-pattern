package decorator_pattern;

public class Engineer extends Employee{

	

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+60000;
		
	}

}
