package com.myecommerce.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.myecommerce.configuration.DBConfiguration;
import com.myecommerce.entity.ProductEntity;
import com.myecommerce.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public ProductEntity addProduct(ProductEntity productEntity) {
		Connection connection = DBConfiguration.getDBConnection();
		String sql = "INSERT INTO product (product_name, description, price_per_qty, available_qty, category_id_fk) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, productEntity.getProductName());
			statement.setString(2, productEntity.getDescription());
			statement.setDouble(3, productEntity.getPricePerQty());
			statement.setInt(4, productEntity.getAvailableQty());
			statement.setLong(5, productEntity.getCategoryEntity().getCategoryId());
			
			int rowsInserted = statement.executeUpdate();
            if(rowsInserted>0)
            {
                System.out.println("A new product was inserted successfully!");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productEntity;
	}

	@Override
	public ProductEntity getProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
