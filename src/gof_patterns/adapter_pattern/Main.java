package gof_patterns.adapter_pattern;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("961212","Mel","Dias","10","45621");
		
		Student studentadap = new AdapterController(person);
		String fullname = studentadap.getFullName();
		System.out.println(fullname);
	}
}
