package com.basicrest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.basicrest.dto.CustomerInfo;

@Path("/paytm")
public class PaytmApi {

	@Path("/balance/{mobileNo}")
	@GET
	@Produces("text/plain")
	public double getBalance(@PathParam("mobileNo") String mobileNo) {
		System.out.println("mobile No :" + mobileNo);
		return 900;
	}

	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String register(CustomerInfo customerInfo) {
		System.out.println(customerInfo);
		return "account created with customer no as : " + customerInfo.getCustomerNo();
	}

}
