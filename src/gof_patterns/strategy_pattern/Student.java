package strategy_pattern;

public abstract class Student {

	IFestival iFestival;
	IPrograms iPrograms;
	
	public void offerPrograms() {
		iPrograms.offerPrograms();
	}
	
	public void conductEvent() {
		iFestival.performEvent();
	}

	public void setiFestival(IFestival iFestival) {
		this.iFestival = iFestival;
	}

	public void setiPrograms(IPrograms iPrograms) {
		this.iPrograms = iPrograms;
	}
	
	
	
	public Student() {
		super();
		this.iFestival=new CodeFest();
		this.iPrograms = new BScPrograms();
		
		// TODO Auto-generated constructor stub
	}

	public abstract void displayStudents();
	
}
