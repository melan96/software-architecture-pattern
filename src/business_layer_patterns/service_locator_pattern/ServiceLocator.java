package business_layer_patterns.service_locator_pattern;

public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String serviceName){
        Service service = cache.getService(serviceName);

        if(service!=null){
           return service;
        }
        InitialContext context = new InitialContext();
        Service service1 =(Service) context.serviceLookUP(serviceName);
        cache.addServiceToCache(service1);
        return service1;
    }
}
