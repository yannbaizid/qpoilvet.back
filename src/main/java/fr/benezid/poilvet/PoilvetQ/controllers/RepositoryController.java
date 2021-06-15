package fr.benezid.poilvet.PoilvetQ.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public interface RepositoryController<T> {

	

	@GetMapping("/getall")
	@CrossOrigin
	public  List<T> getAll();
	
	
	
	@PostMapping("/save")
	@CrossOrigin
	public T save(@RequestBody T item);
}