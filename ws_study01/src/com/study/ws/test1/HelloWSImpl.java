package com.study.ws.test1;

import javax.jws.WebService;

@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()");
		return "Hello: " + name;
	}

}
