package com.cmc.ecommerce.service;

import org.springframework.http.ResponseEntity;

import com.cmc.ecommerce.dto.ProductCategoryCreateDto;
import com.cmc.ecommerce.dto.ProductCategoryCreateResponse;

public interface ProductCategoryService {

	ResponseEntity<ProductCategoryCreateResponse> create(ProductCategoryCreateDto dto);

}
