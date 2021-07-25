package fr.benezid.poilvet.PoilvetQ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.benezid.poilvet.PoilvetQ.bo.generic.Category;
import fr.benezid.poilvet.PoilvetQ.services.CategoryService;




@RestController
@RequestMapping("/category")
public class CategoryController implements RepositoryController<Category> {
	@Autowired
	CategoryService categoryService;

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryService.getAll();
	}

	@Override
	public Category save(Category category) {
		return categoryService.save(category);
	}

}
