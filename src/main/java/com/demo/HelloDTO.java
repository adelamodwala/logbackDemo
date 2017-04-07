package com.demo;

import org.springframework.http.RequestEntity;

/**
 * Created by adel.amodwala on 4/7/2017.
 */
public class HelloDTO {
    private String message;
    private RequestEntity request;

    public HelloDTO(String message, RequestEntity request) {
        this.message = message;
        this.request = request;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RequestEntity getRequest() {
        return request;
    }

    public void setRequest(RequestEntity request) {
        this.request = request;
    }
}
