package fr.benezid.poilvet.PoilvetQ.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController

public interface RepositoryController<T> {

	

	@GetMapping("/getall")
	@CrossOrigin
	List<T> getAll();


	@PostMapping(path = "/save")
	@CrossOrigin
	T save(@RequestBody T object);
}