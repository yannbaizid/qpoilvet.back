package fr.benezid.poilvet.PoilvetQ.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benezid.poilvet.PoilvetQ.bo.generic.WebFile;

public interface FileDao extends CrudRepository<WebFile, Integer> {

}
