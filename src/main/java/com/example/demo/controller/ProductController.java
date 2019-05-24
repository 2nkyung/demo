package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductService;
import com.example.demo.vo.ProductVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductController {
	
	@Resource
	private ProductService ps;

	@CrossOrigin(origins="*")
	@GetMapping("/products")
	public List<ProductVO> selectProduct(){
		return ps.selectProduct();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/product")
	public int insertProduct(@RequestBody ProductVO product) {
		log.info("insert=>{}",product);
		return ps.insertProduct(product);
	}
	
	@CrossOrigin(origins="*")
	@DeleteMapping("/product")
	public int deleteProduct(@RequestBody ProductVO product){
		log.info("delete=>{}",product);
		return ps.deleteProduct(product);
	}
	
	@CrossOrigin(origins="*")
	@PutMapping("/product")
	public int updateProduct(@RequestBody ProductVO product){
		return ps.updateProduct(product);
	}
}
