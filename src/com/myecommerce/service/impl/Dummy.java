package com.myecommerce.service.impl;

import java.util.List;

import com.myecommerce.dto.ProductDTO;
import com.myecommerce.exception.BusinessException;
import com.myecommerce.service.ProductService;

public class Dummy implements ProductService {

	@Override
	public ProductDTO addProduct(ProductDTO productDTO) throws BusinessException {
		System.out.println("This is dummy");
		return null;
	}

	@Override
	public ProductDTO getProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> searchProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO updateProductPrice(Long productId, Double newPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO deleteProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
