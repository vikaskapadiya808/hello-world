package com.basicrest.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.basicrest.dto.CustomerInfo;

@Provider
public class JSONMessageBodyReader implements MessageBodyReader<CustomerInfo> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type == CustomerInfo.class;
	}

	@Override
	public CustomerInfo readFrom(Class<CustomerInfo> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {

		JSONParser jsonParser = new JSONParser();
		CustomerInfo customerInfo = new CustomerInfo();
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new InputStreamReader(entityStream, "UTF-8"));
			customerInfo.setCustomerNo(Integer.parseInt(jsonObject.get("customerNo").toString()));
			customerInfo.setCustomerName(jsonObject.get("customerName").toString());
			customerInfo.setEmailAddress(jsonObject.get("emailAddress").toString());
			customerInfo.setCountry(jsonObject.get("country").toString());

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customerInfo;
	}

}
