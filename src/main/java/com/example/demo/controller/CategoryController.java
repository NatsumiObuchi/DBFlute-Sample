package com.example.demo.controller;

import com.example.demo.cbean.CategoryCB;
import com.example.demo.exbhv.CategoryBhv;
import com.example.demo.exentity.Category;

import java.util.List;

import org.dbflute.bhv.readable.CBCall;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class CategoryController {
	
	@Autowired
	private CategoryBhv categoryBhv;
	
	@RequestMapping("/top")
	public String test() throws Exception{
	

//		１．失敗（エラー：Not found the invoker of behavior command in the behavior!）
		Integer categoryId = 1;
		categoryBhv.selectEntity(cb -> cb.acceptPK(categoryId)).alwaysPresent(cat -> {
            String categoryName = cat.getCategoryName();
            System.out.println(categoryName);
		});
            
		
//		2.失敗 Bhvのメソッドの引数はラムダで渡さなきゃいけない・・・
//		CategoryCB cb = new CategoryCB();
//		Category category = categoryBhv.selectEntityWithDeletedCheck(cb -> {		
//			cb.query().setCategoryName_Equal("食費");
//		});
			
//		３．失敗　１と同じエラー。CBのコマンドを使用するには、インボーカーインスタンスを作成しなければならない・・・
//		OptionalEntity<Category> category = categoryBhv.selectEntity(cb -> {
//			cb.query().setCategoryName_Equal("食費");
//			
//		});
//		System.out.println(category);
		
//		４．失敗　同じエラー
//		ListResultBean<Category> categoryList = categoryBhv.selectList(cb -> {
//			cb.query().setCategoryName_Equal("食費");
//		});
//		System.out.println(categoryList);
		
		return "top";
	}
}
