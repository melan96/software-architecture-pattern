package business_layer_patterns.business_delegator_pattern;

public class BusinessDelegator {

	private BusinessService businessService;
	private BusinessServiceLocator businessServiceLocator = new BusinessServiceLocator();
	private String serviceName;

	public void setString(String serviceName) {
		this.serviceName = serviceName;
	}

	// executed process over user required modules
	public void doProcess() {
		if (!this.serviceName.isEmpty()) {
			businessService = businessServiceLocator.getService(serviceName);

			// execute process
			businessService.executeService();
		} else {
			System.out.println("Service Name should set before executing..");
		}
	}

}
