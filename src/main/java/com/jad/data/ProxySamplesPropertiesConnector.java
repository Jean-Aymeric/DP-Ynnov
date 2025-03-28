package com.jad.data;

import java.util.HashMap;

public class ProxySamplesPropertiesConnector implements ISamplesPropertiesConnector {
    private final static HashMap<Integer, String> cache = new HashMap<>();
    private final SamplesPropertiesConnector samples = SamplesPropertiesConnector.getInstance();

    @Override
    public String getById(int id) {
        if (id == 1) return "ALERT FORBIDDEN ACCESS";
        if (!ProxySamplesPropertiesConnector.cache.containsKey(id)) {
            System.out.println("Accessing sample " + id);
            ProxySamplesPropertiesConnector.cache.put(id, this.samples.getById(id));
        }
        return ProxySamplesPropertiesConnector.cache.get(id);
    }
}
