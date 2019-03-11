package gof_patterns.adapter_pattern;

public class Person {

	private String NIC;
	private String firstName;
	private String lastName;
	private String dob;
	private String phoneNumber;
	

	public Person(String nIC, String firstName, String lastName, String dob, String phoneNumber) {
		super();
		NIC = nIC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
	}
	
	public String getNIC() {
		return NIC;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDob() {
		return dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
