package com.example.demo.controller;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.dbflute.cbean.CategoryCB;
import org.docksidestage.dbflute.exbhv.CategoryBhv;
import org.docksidestage.dbflute.exentity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class CategoryController {
	
	private CategoryBhv categoryBhv;
	
	@RequestMapping("/top")
	public String test() {
//		CategoryCB cb = new CategoryCB();
		OptionalEntity<Category> category = categoryBhv.selectEntity(cb -> {
			cb.query().setCategoryName_Equal("食費");
			
		});
		System.out.println(category);
		return "top";
	}
}
