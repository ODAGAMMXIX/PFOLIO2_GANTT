package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ProjetosDao;
import model.entities.Projetos;

public class ProjetosService {
	
	private ProjetosDao dao = DaoFactory.createProjetosDao();
	
	public List<Projetos> findAll() {
		

		return dao.findAll();
	}
	
	public void saveOrUpdate(Projetos obj) {
		if(obj.getId()==null) {
			dao.insert(obj);
		}
		
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Projetos obj) {
		dao.deleteById(obj.getId());
	}

}
