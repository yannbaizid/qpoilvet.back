package fr.benezid.poilvet.PoilvetQ.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benezid.poilvet.PoilvetQ.bo.generic.Item;

public interface ItemDao extends CrudRepository<Item, Integer> {

}
