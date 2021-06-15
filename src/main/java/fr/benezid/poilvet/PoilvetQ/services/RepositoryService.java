package fr.benezid.poilvet.PoilvetQ.services;

import java.util.List;

public interface RepositoryService<T> {
	public T save(T object);
	
	public List<T> getAll();
	
	public T get(int id);
	
	public void delete(int id);

	public void delete(T object);
}
