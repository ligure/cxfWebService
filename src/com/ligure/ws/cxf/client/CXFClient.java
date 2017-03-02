package com.ligure.ws.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

public class CXFClient {

    public static void main(String[] args) throws Exception {
	DynamicClientFactory dcf = DynamicClientFactory.newInstance();
	Client client = dcf
		.createClient("http://localhost:8080/cxfws/service/HelloSoap?wsdl");
	Object[] res = client.invoke("sayHello", new String[] { "ligure" });
	System.out.println(res[0]);
    }

}
