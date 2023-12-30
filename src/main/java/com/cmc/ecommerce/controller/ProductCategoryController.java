package com.cmc.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.ecommerce.dto.ProductCategoryCreateDto;
import com.cmc.ecommerce.dto.ProductCategoryCreateResponse;
import com.cmc.ecommerce.service.ProductCategoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product-category")
public class ProductCategoryController {
	
	private final ProductCategoryService service;

	@PostMapping
	public ResponseEntity<ProductCategoryCreateResponse> create(@RequestBody ProductCategoryCreateDto dto) {
		log.info("Api: {}, Request: {}", "/api/v1/product-category", dto.toString());
		
		return service.create(dto);
	}
}
