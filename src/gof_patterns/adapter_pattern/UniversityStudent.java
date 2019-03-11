package gof_patterns.adapter_pattern;

public class UniversityStudent implements Student{

	
	private String fullName;
	private String age;
	private String contactNumber;
	
	
	
	
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	
	
	public String getFullName() {
		// TODO Auto-generated method stub
		return this.fullName;
	}

	
	public String getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	
	public String getContactNumber() {
		// TODO Auto-generated method stub
		return this.contactNumber;
	}

}
