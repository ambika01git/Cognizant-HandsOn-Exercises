package com.cognizant.mockito;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
    public String fetchDataById(int id) {
        return externalApi.getDataById(id);
    }
    public void send(String message) {
        externalApi.sendData(message);
    }

}