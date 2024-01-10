package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {
	List<Product> getProduct();
	Product getProductById(int id);
	void insertProduct(Product p);
}
