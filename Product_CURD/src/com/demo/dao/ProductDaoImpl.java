package com.demo.dao;
import com.demo.beans.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao{
	static Connection con;
	static PreparedStatement getProd, getProdById, inserProd, delProdById, upProdById;
	static {
		con = DBUtil.getMyConnection();
		try {
			getProd = con.prepareStatement("select * from product");
			getProdById = con.prepareStatement("select * from product where pid = ?");
			inserProd = con.prepareStatement("insert into product values(?,?)");
			delProdById = con.prepareStatement("delete from product where pid = ?");
			upProdById = con.prepareStatement("update product set desc = ? where pid = ?");
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public List<Product> getProduct(){
		List<Product> p_arr = new ArrayList<>();
		try {
			ResultSet rs = getProd.executeQuery();
			while(rs.next()) {
				p_arr.add(new Product(rs.getInt(1), rs.getString(2)));
			}
			return p_arr;
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
		return null;
	}
	
	public Product getProductById(int id) {
		try {
			getProdById.setInt(1,id);
			ResultSet rs = getProdById.executeQuery();
			if(rs.next())
				return new Product(rs.getInt(1), rs.getString(2));
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
		return null;
	}
	
	public void insertProduct(Product p) {
		try {
			inserProd.setInt(1, p.getPid());
			inserProd.setString(2, p.getDesc());
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
