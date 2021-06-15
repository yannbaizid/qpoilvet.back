package fr.benezid.poilvet.PoilvetQ.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.benezid.poilvet.PoilvetQ.bo.Category;
import fr.benezid.poilvet.PoilvetQ.dao.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired
private CategoryDao categoryDao;
	
	@Override
	public Category save(Category object) {
		// TODO Auto-generated method stub
		return categoryDao.save(object);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryDao.findAll();
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Category object) {
		// TODO Auto-generated method stub

	}

}
