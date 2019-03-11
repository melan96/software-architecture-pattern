package gof_patterns.adapter_pattern;



public class AdapterController implements Student{

	Person p;
	
	
	public AdapterController(Person p) {
		super();
		this.p = p;
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return p.getFirstName()+" "+p.getLastName();
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return p.getDob();
	}

	@Override
	public String getContactNumber() {
		// TODO Auto-generated method stub
		return p.getPhoneNumber();
	}

}
