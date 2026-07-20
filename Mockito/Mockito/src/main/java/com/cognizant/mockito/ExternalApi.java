package com.cognizant.mockito;

public interface ExternalApi {

    String getData();
    String getDataById(int id);

    void sendData(String message);

}