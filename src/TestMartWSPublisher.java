import javax.xml.ws.Endpoint;

import com.hemant.testmart.ProductCatalog;

public class TestMartWSPublisher {
	public static void main(String[] args) {
		
		//pretty much following line is what it takes to publish a web service
		//Java JDK has a built in support for publishing a web service
		//All of this work is done internally by a Metro project which is a reference
		//implementation of the JAX-WS standard. It strictly follows the standard.
		//Even when we deploy this WS to GlassFish, GF is using Metro internally.
		
		//Also note that this is recommended just for testing and should not be used in production
		//the main problem is this supports only single threads
		//GF however provides multiple threads 
		Endpoint.publish("http://localhost:1234/testmartcatalog/", new ProductCatalog());
	}
}
