package com.nahid.nasadailyimage;

public interface IotdHandlerListener {
    
    public void iotdParsed(String url, String title, String description, String date);

}
