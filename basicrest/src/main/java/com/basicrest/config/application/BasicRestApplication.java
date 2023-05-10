package com.basicrest.config.application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest/*")
public class BasicRestApplication extends Application {

	public BasicRestApplication() {
		System.out.println("called..");
	}

}
