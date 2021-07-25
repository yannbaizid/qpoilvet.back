package fr.benezid.poilvet.PoilvetQ.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.benezid.poilvet.PoilvetQ.bo.generic.Item;
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
    @CrossOrigin
    public Item save(Item item) {
        item = itemService.save(item);

        return item;
    }

}
