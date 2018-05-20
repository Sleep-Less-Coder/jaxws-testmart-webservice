package com.hemant.testmart;

import java.util.List;

import javax.jws.WebService;

import com.hemant.testmart.business.ProductServiceImpl;
import com.hemant.testmart.model.Product;

@WebService(endpointInterface = "com.hemant.testmart.ProductCatalogInterface", serviceName = "TestMartCatalogService", targetNamespace = "http://testmart.com", portName = "TestMartCatalogPort")
public class ProductCatalog implements ProductCatalogInterface {

	// Get the instance of the Impl
	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	/* (non-Javadoc)
	 * @see com.hemant.testmart.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productServiceImpl.getProductCategories();

	}

	/* (non-Javadoc)
	 * @see com.hemant.testmart.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productServiceImpl.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see com.hemant.testmart.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsV2(String category) {
		return productServiceImpl.getProductsV2(category);
	}

	/* (non-Javadoc)
	 * @see com.hemant.testmart.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
}
