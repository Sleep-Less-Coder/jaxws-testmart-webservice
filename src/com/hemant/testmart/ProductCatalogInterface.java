package com.hemant.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.hemant.testmart.model.Product;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", 
serviceName = "TestMartCatalogService", targetNamespace = "http://testmart.com")
//@SOAPBinding(style = Style.RPC)
public interface ProductCatalogInterface {
	
	@WebMethod(action = "fetch_categories" , operationName = "fetchProductCategories")
	List<String> getProductCategories();
	
	@WebMethod
	List<String> getProducts(String category);
	
	@WebMethod
	@WebResult(name = "Product")
	List<Product> getProductsV2(String category);
	
	@WebMethod
	boolean addProduct(String category, String product);

}