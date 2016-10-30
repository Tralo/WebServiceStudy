package com.study.ws.test1.server;

import javax.xml.ws.Endpoint;

import com.study.ws.test1.HelloWSImpl;

/**
 * 发布webService
 */
public class ServetTest {
	
	public static void main(String[] args) {
		String address = "http://192.168.1.102:8989/ws_study01/hellows";
		Endpoint.publish(address, new HelloWSImpl());
		System.out.println("WebService发布成功");
		
	}

}
