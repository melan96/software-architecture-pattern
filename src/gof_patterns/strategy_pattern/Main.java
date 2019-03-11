package strategy_pattern;

public class Main {

	public static void main(String[] args) {
		
		Student poStudent = new PostGraduateStudents();
		poStudent.offerPrograms();
		poStudent.conductEvent();
		poStudent.displayStudents();
		
		System.out.println("\n\n******************New Event**************");
		poStudent.setiFestival( new CodeFest());
		poStudent.conductEvent();
		
		System.out.println("\n\n******************New Event**************");
		
		Student unStudents = new UndergraduateStudents();
		unStudents.offerPrograms();
		unStudents.conductEvent();
		unStudents.displayStudents();
		
		System.out.println("\n\n******************New Event**************");
		unStudents.setiPrograms(new MScPrograms());;
		unStudents.offerPrograms();
		
		
		
	}
}
