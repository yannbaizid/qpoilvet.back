package fr.benezid.poilvet.PoilvetQ.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benezid.poilvet.PoilvetQ.bo.Category;

public interface CategoryDao extends CrudRepository<Category, Integer> {

}
