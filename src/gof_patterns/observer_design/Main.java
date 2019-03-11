package observer_design;

public class Main {

	public static void main(String[] args) {
		Observer ob1 = new ObserverImp("observer 1");
		
		Subject sub1 = new SubjectImp();
		sub1.registerObserver(ob1);
		sub1.setStatus("status 11");
		
	}
}
