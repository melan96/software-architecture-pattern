package business_layer_patterns.business_delegator_pattern;

public class BusinessServiceLocator {

	
	public BusinessService getService(String serviceName) {
		if(serviceName.equalsIgnoreCase("EJBService")) {
			return new EJBService();
		}
		else if(serviceName.equalsIgnoreCase("JMService")) {
			return new JMService();
		}else {
			return null;
		}
	}
	
}
