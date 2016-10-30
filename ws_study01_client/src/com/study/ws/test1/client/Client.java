package com.study.ws.test1.client;

import com.study.ws.test1.HelloWSImpl;
import com.study.ws.test1.HelloWSImplService;

public class Client {
	
	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		HelloWSImpl helloWs = factory.getHelloWSImplPort();
		helloWs.sayHello("hahahahah");
	}

}
