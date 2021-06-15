package fr.benezid.poilvet.PoilvetQ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.benezid.poilvet.PoilvetQ.bo.Item;
import fr.benezid.poilvet.PoilvetQ.services.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController implements RepositoryController<Item> {

	@Autowired
	ItemService itemService;
	
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemService.getAll();
	}

	@Override
	public Item save(Item item) {
		System.out.println(item);
		return null;
	}

}
