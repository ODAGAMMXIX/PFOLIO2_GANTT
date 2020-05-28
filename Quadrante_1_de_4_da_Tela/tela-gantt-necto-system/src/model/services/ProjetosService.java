package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Projetos;

public class ProjetosService {
	
	public List<Projetos> findAll() {
		List<Projetos> list = new ArrayList<>();
		list.add(new Projetos(1,"Front end", "25/05/2020","Caroline", "20" ));
		list.add(new Projetos(2,"Scrum Master", "20/05/2020","Denise", "25" ));
		list.add(new Projetos(3,"Product Owner", "22/05/2020","Fábio", "22" ));
		list.add(new Projetos(4,"Back end", "10/05/2020","Wilson", "27" ));

		return list;
	}

}
