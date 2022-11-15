package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class SlowServiceManager {

    private SlowService slowService;

    private Map<String, String> responseCache = new HashMap<>();

    public SlowServiceManager() {
    }

    public String process(String param) {

        // we are handling caching in the proxy class
        if (slowService != null && responseCache.containsKey(param)) {
            System.out.println("Using cache instead of expensive API call");
            return responseCache.get(param);
        }

        // initialization is slow, we want it to happen only if required
        if (slowService == null) {
            System.out.println("Just initializing the service because it's needed now!");
            slowService = new SlowService();
        }

        System.out.println("We are actually calling the SlowService!");

        var response = slowService.process();
        // populating the cache
        responseCache.put(param, response);
        return response;
    }
}
