package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import db.DB;
import db.DbException;
import model.dao.Projetos2Dao;
import model.entities.Projetos2;

public class Projetos2DaoJDBC implements Projetos2Dao {

	private Connection conn;
	
	public Projetos2DaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public List<Projetos2> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT * FROM projetos2");
				rs = st.executeQuery();
				
			List<Projetos2> list = new ArrayList<>();
			
			
			while (rs.next()) {
				
				while (rs.next()) {
					Projetos2 obj = new Projetos2();
					obj.setId(rs.getInt("Id"));
					obj.setTitleproject(rs.getString("titleproject"));
					obj.setDuration(new java.util.Date(rs.getTimestamp("Duration").getTime()));
					obj.setProjectcol(rs.getString("projectcol"));
				

					list.add(obj);
				}
				return list;
			
		}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		return null;
		
		
	}
	
	@Override
	public void insert(Projetos2 obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO projetos2 "
					+ "(P_title, P_duration, Projectcol) "
					+ "VALUES "
					+ "(?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getTitleproject());
			st.setDate(2, (Date) obj.getDuration());
			st.setString(3, obj.getProjectcol());
			

			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	
	
		}
	
		@Override
		public void update(Projetos2 obj) {
			PreparedStatement st = null;
			try {
				st = conn.prepareStatement(
						"UPDATE projetos2 "
						+ "SET P_title = ?, P_duration = ?, Projectcol = ?"
						+ "WHERE Id = ?");
				
				st.setString(1, obj.getTitleproject());
				st.setDate(2, (Date) obj.getDuration());
				st.setString(3, obj.getProjectcol());
				

				
				st.setInt(4, obj.getId());
				
				st.executeUpdate();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
			finally {
				DB.closeStatement(st);
			}
		}

	
	
	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM projetos2 WHERE Id = ?");
			
			st.setInt(1, id);
			
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}


	@Override
	public Projetos2 findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
				"SELECT * FROM projetos2 WHERE Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Projetos2 obj = new Projetos2();
				obj.setId(rs.getInt("Id"));
				obj.setTitleproject(rs.getString("P_title"));
				obj.setDuration(rs.getDate("P_duration"));
				obj.setProjectcol(rs.getString("projectcol"));
				

				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	
	
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
