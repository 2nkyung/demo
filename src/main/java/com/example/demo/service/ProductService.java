package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.ProductVO;

public interface ProductService {
	public List<ProductVO> selectProduct();
	int insertProduct(ProductVO product);
	int deleteProduct(ProductVO product);
	int updateProduct(ProductVO product);
	public ProductVO selectProductByCode(ProductVO product);
}
