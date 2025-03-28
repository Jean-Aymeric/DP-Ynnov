package com.jad;

import com.jad.data.ProxySamplesPropertiesConnector;

public class Client {
    private final ProxySamplesPropertiesConnector samples;

    public Client() {
        this.samples = new ProxySamplesPropertiesConnector();
    }

    public void work() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.samples.getById(i));
        }
    }
}
