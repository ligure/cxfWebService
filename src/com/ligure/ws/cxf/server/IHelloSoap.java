package com.ligure.ws.cxf.server;

import javax.jws.WebService;

@WebService(targetNamespace = "cxf.ws.ligure.com")
public interface IHelloSoap {

    public abstract String sayHello(String name);

    public abstract String dating(String time, String place);

}