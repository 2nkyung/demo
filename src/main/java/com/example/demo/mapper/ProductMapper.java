package com.example.demo.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.example.demo.vo.ProductVO;

@MapperScan
public interface ProductMapper {
	public List<ProductVO> selectProduct();
	int insertProduct(ProductVO product);
	int deleteProduct(ProductVO product);
	int updateProduct(ProductVO product);
}
