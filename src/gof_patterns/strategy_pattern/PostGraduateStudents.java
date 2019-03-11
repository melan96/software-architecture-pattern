package strategy_pattern;

public class PostGraduateStudents extends Student {

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		System.out.println("Display Post Graduate Student");
	}

	public PostGraduateStudents() {
		super();
		this.setiFestival(new RoboFest() );
		this.setiPrograms(new DoctoralPrograms());
		// TODO Auto-generated constructor stub
	}
	
	

}
