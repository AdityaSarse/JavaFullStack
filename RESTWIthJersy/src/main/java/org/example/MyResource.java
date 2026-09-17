package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class MyResource {

    @GET
    public String hello() {
        return "Hello from Java REST API!";
    }
}