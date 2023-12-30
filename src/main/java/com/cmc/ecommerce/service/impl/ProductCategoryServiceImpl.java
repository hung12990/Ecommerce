package com.cmc.ecommerce.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cmc.ecommerce.dto.ProductCategoryCreateDto;
import com.cmc.ecommerce.dto.ProductCategoryCreateResponse;
import com.cmc.ecommerce.repository.ProductCategoryRepository;
import com.cmc.ecommerce.service.ProductCategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	private final ProductCategoryRepository productCategoryRepository;
	
	

	@Override
	public ResponseEntity<ProductCategoryCreateResponse> create(ProductCategoryCreateDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
