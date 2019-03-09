package business_layer_patterns.service_locator_pattern;

public class ServiceOne implements Service{


    @Override
    public void execute() {
        System.out.println("Serivce One executed");
    }

    @Override
    public String getService() {
        return "ServiceOne.Services";
    }
}
