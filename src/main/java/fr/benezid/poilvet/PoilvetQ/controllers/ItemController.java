package fr.benezid.poilvet.PoilvetQ.controllers;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Converter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

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
    @CrossOrigin
    public Item save(Item item) {
        item = itemService.save(item);

        return item;
    }

}
