package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import com.example.demo.vo.ProductVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
	
	@Resource
	private ProductMapper pm;
	
	@Override
	public List<ProductVO> selectProduct() {
		return pm.selectProduct();
	}

	@Override
	public int insertProduct(ProductVO product) {
		log.info("rrrrrrrr{}",product);
		return pm.insertProduct(product);
	}

	@Override
	public int deleteProduct(ProductVO product) {
		// TODO Auto-generated method stub
		return pm.deleteProduct(product);
	}

	@Override
	public int updateProduct(ProductVO product) {
		// TODO Auto-generated method stub
		return pm.updateProduct(product);
	}

}
