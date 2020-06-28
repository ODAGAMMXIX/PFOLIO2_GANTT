package model.dao;

import db.DB;
import model.dao.impl.Projetos2DaoJDBC;

public class DaoFactory2 {
	
	public static Projetos2Dao createProjetos2Dao() {
		return new Projetos2DaoJDBC(DB.getConnection());
	}
		
}
