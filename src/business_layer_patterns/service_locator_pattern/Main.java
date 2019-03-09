package business_layer_patterns.service_locator_pattern;

public class Main {


    public static void main(String[] args){
        Service service = ServiceLocator.getService("ServiceOne");
        service.execute();
    }
}
