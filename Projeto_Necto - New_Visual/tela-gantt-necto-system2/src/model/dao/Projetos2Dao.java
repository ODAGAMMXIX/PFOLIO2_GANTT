package model.dao;

import java.util.List;

import model.entities.Projetos2;

public interface Projetos2Dao {

	void insert(Projetos2 obj);
	void update(Projetos2 obj);
	void deleteById(Integer id);
	Projetos2 findById(Integer id);
	List<Projetos2>findAll();
}	