package model.services;

import java.util.List;

import model.dao.DaoFactory2;
import model.dao.Projetos2Dao;
import model.entities.Projetos2;

public class Projetos2Service {
	
	private Projetos2Dao dao = DaoFactory2.createProjetos2Dao();
	
	public List<Projetos2> findAll() {
		

		return dao.findAll();
	}
	
	public void saveOrUpdate(Projetos2 obj) {
		if(obj.getId()==null) {
			dao.insert(obj);
		}
		
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Projetos2 obj) {
		dao.deleteById(obj.getId());
	}

}
