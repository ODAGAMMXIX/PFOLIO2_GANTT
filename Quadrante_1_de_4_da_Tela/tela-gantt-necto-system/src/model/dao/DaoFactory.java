package model.dao;

import db.DB;
import model.dao.impl.ProjetosDaoJDBC;

public class DaoFactory {
	
	public static ProjetosDao createProjetosDao() {
		return new ProjetosDaoJDBC(DB.getConnection());
	}
		
}
