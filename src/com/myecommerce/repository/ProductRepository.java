package com.myecommerce.repository;

import java.util.List;

import com.myecommerce.entity.ProductEntity;

public interface ProductRepository {
	
	public ProductEntity addProduct(ProductEntity productEntity);
	public ProductEntity getProduct(Long productId);
	public List<ProductEntity> getAllProducts();
	
}
