package observer_design;

public class ObserverImp implements Observer{

	
	private String name;
	private String state;
	
	
	
	public ObserverImp(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		
		this.state = subject.getStatus();
		System.out.println("Observer name  : "+this.name+ "  updated  :  "+this.state );
	}

	
	
}
