package business_layer_patterns.service_locator_pattern;

public class InitialContext {

    public Object serviceLookUP(String serviceName){
        if(serviceName.equalsIgnoreCase("ServiceOne")){
            return new ServiceOne();
        }
        else if(serviceName.equalsIgnoreCase("ServiceTwo")){
            return new ServiceTwo();
        }
        return null;
    }
}
