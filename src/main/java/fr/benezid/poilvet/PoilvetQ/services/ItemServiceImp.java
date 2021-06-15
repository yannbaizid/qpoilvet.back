package fr.benezid.poilvet.PoilvetQ.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.benezid.poilvet.PoilvetQ.bo.Item;
import fr.benezid.poilvet.PoilvetQ.dao.ItemDao;

@Service
public class ItemServiceImp implements ItemService {
@Autowired
ItemDao itemDao;
	
	@Override
	public Item save(Item object) {
		// TODO Auto-generated method stub
		return itemDao.save(object);
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return (List<Item>) itemDao.findAll();
	}

	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		return itemDao.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		Item item=new Item();
		item.setId(id);
		delete(item);

	}

	@Override
	public void delete(Item object) {
		itemDao.delete(object);


	}

}
