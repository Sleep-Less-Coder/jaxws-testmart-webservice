package com.hemant.testmart.business;

import java.util.List;

import com.hemant.testmart.model.Product;

public interface ProductService {
	public List<String> getProductCategories();
	public List<String> getProducts(String category);
	public boolean addProduct(String category, String product);
	public List<Product> getProductsV2(String category);
}