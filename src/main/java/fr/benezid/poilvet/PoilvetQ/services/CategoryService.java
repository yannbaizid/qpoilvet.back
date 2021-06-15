package fr.benezid.poilvet.PoilvetQ.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.benezid.poilvet.PoilvetQ.bo.Category;


@Service
@Component
public interface CategoryService extends RepositoryService<Category> {

}
