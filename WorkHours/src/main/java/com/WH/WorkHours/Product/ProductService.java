package com.WH.WorkHours.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;

	public List<ProductDTO> getAllProducts() 
	{ 
		List<ProductEntity> products = repo.findAll();
	     return products.stream() 
			.map(product -> new ProductDTO(product.getPRODUCTNAME())) 
			.collect(Collectors.toList()); }
	

	
   
	

}
