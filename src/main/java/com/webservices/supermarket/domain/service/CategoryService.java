package com.webservices.supermarket.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.supermarket.domain.repository.CategoryRepository;
import com.webservices.supermarket.persistence.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Optional<List<Category>> getCategories(){
		return categoryRepository.getCategories();
	}

}