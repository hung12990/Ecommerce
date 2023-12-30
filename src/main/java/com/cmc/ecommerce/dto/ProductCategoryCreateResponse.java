package com.cmc.ecommerce.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductCategoryCreateResponse {

	@JsonProperty("product_category_id")
	private Integer productCategoryId;
	
	@JsonProperty("created_at")
	private LocalDateTime createdAt;
	
	@JsonProperty("created_by")
	private String createdBy;
}
