package business_layer_patterns.service_locator_pattern;

public class ServiceTwo implements Service {
    @Override
    public void execute() {
        System.out.println("ServiceTwo executed");
    }

    @Override
    public String getService() {
        return "ServiceTwo.services";
    }
}
