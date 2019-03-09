package business_layer_patterns.service_locator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> cacheServices;
    public Cache(){
        cacheServices = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for(Service service:cacheServices){
            if(service.getService().equalsIgnoreCase("serviceName")){
                return service;
            }


        }
        return null;
    }

    public void addServiceToCache(Service service){

        while(true){
            for(Service serviceCheck:cacheServices){
                if(serviceCheck.getService().equalsIgnoreCase(service.getService())){
                    return;
                }else{
                    cacheServices.add(service);
                }
            }
        }

    }
}
