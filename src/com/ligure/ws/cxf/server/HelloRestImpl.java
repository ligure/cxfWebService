package com.ligure.ws.cxf.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestBody;

public class HelloRestImpl implements IHelloRest {

    @GET
    @Path("/gg")
    public String getSomething() {
	return "123";
    }

    @GET
    @Path("/gg1")
    public String getSomething1(@RequestBody String s) {
	System.out.println(s);
	return "456";
    }

}
