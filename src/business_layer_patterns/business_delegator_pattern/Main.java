package business_layer_patterns.business_delegator_pattern;

public class Main {

	
	public static void main(String[] args) {
		BusinessDelegator businessDelegator = new BusinessDelegator();
		businessDelegator.setString("JMService");
		businessDelegator.doProcess();
	}
}
