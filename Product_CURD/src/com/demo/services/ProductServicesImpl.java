package com.demo.services;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Product;
import com.demo.dao.ProductDaoImpl;

public class ProductServicesImpl implements ProductServices{
	private ProductDaoImpl pdao;
	public ProductServicesImpl() {
		pdao = new ProductDaoImpl();
	}
	@Override
	public List<Product> getAll() {
		return pdao.getProduct();
	}

	@Override
	public Product showById(int id) {
		return pdao.getProductById(id);
	}

	@Override
	public void addProduct(Product p) {
		pdao.insertProduct(p);
		
	}
	
}
