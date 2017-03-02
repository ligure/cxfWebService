package com.ligure.ws.cxf.server;

import javax.jws.WebService;

@WebService(targetNamespace = "cxf.ws.ligure.com", endpointInterface = "com.ligure.ws.cxf.server.IHelloSoap", serviceName = "HelloSoap")
public class HelloSoapImpl implements IHelloSoap {

    @Override
    public String sayHello(String name) {
	return "Hello," + name + "！ This is HelloService！";
    }

    @Override
    public String dating(String time, String place) {
	return "To meet at " + place + " at" + time;
    }

}
