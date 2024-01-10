package com.demo.services;

import java.util.List;
import com.demo.beans.*;
public interface ProductServices {
	List<Product> getAll();
	Product showById(int id);
	void addProduct(Product p);
}
