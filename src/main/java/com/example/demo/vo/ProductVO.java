package com.example.demo.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("pr")
public class ProductVO {

	private String productCode;
	private String productName;
	private String productParentCode;
	private String productLots;
	private String productSpec;
	private String productDescription;
	private String companyCode;

}
