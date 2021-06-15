package fr.benezid.poilvet.PoilvetQ.dao;

import org.springframework.data.repository.CrudRepository;

import fr.benezid.poilvet.PoilvetQ.bo.File;

public interface FileDao extends CrudRepository<File, Integer> {

}
