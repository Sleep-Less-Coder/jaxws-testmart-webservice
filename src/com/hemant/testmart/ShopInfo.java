package com.hemant.testmart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.hemant.testmart.exceptions.InvalidInputException;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(name = "propertyOut")
	public String getShopInfo(@WebParam(name = "propertyIn") String property) throws InvalidInputException {
		String response = null;
		if(property.equals("shopName")) {
			response = "Test Mart";
		} else if (property.equals("since")) {
			response = "Since 1990";
		} else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input argument.");
		}
		return response;
	}
}
