package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exbhv.CategoryBhv;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryBhv categoryBhv;

	public void notNUllCategory() {
		categoryBhv.selectCount(cb -> {
			cb.query().setId_IsNotNull();
		});
//		System.out.println(count);
	}
	
}
