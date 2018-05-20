package com.hemant.testmart.business;

import java.util.ArrayList;
import java.util.List;

import com.hemant.testmart.model.Product;

public class ProductServiceImpl implements ProductService {

	List<String> moviesList = new ArrayList<String>();
	List<String> booksList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();

	// Constructor
	public ProductServiceImpl() {
		// movies list

		moviesList.add("The SpiderMan");
		moviesList.add("The Batman");
		moviesList.add("Superman");

		// books list

		booksList.add("The JAVA master book");
		booksList.add("The painted bird");
		booksList.add("Call it sleep");

		// music list

		musicList.add("Eminem - Believe");
		musicList.add("Charlie Puth - Attention");
		musicList.add("Sia - Cheap Thrills");
		musicList.add("Justin Timberlake - TKO");
		musicList.add("Eminem - Love the way you lie");
		musicList.add("David Guetta - Dangerous");
		musicList.add("Nickky Minaj - Anaconda");
	}

	// get the categories
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();

		categories.add("Movies");
		categories.add("Books");
		categories.add("Music");

		return categories;
	}

	// get products from a category
	public List<String> getProducts(String category) {
	
		if(category != null) {
			switch (category.toLowerCase()) {
			case "movies":
				return moviesList;
				
			case "books":
				return booksList;
				
			case "music":
				return musicList;
				
			default:
				return null;
			}
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
			switch (category.toLowerCase()) {
			case "movies":
				moviesList.add(product);
				System.out.println(moviesList);
				break;
				
			case "books":
				booksList.add(product);
				System.out.println(booksList);
				break;
				
			case "music":
				musicList.add(product);
				System.out.println(musicList);
				break;
			
			default:
				return false;
			}
		return true;	
	}

	public List<Product> getProductsV2(String category) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Java Brains Book", "1234", 19.99));
		products.add(new Product("Another Book", "5678", 29.99));		
		return products;
	}
	
	
}
