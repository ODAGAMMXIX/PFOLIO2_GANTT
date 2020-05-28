package model.dao;

import java.util.List;

import model.entities.Projetos;

public interface ProjetosDao {

	void insert(Projetos obj);
	void update(Projetos obj);
	void deleteById(Integer id);
	Projetos findById(Integer id);
	List<Projetos> findAll();
}	