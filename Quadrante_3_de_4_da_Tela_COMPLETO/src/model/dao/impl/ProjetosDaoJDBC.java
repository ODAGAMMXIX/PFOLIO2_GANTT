package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import db.DB;
import db.DbException;
import model.dao.ProjetosDao;
import model.entities.Projetos;

public class ProjetosDaoJDBC implements ProjetosDao {

	private Connection conn;
	
	public ProjetosDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public List<Projetos> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT * FROM projetos");
				rs = st.executeQuery();
				
			List<Projetos> list = new ArrayList<>();
			
			
			while (rs.next()) {
				
				while (rs.next()) {
					Projetos obj = new Projetos();
					obj.setId(rs.getInt("Id"));
					obj.setTaskname(rs.getString("taskname"));
					obj.setStarttime(rs.getString("starttime"));
					obj.setOwner(rs.getString("owner"));
					obj.setDuration(rs.getString("duration"));
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
	public void insert(Projetos obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO projetos "
					+ "(taskname, starttime, owner, duration) "
					+ "VALUES "
					+ "(?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getTaskname());
			st.setString(2, obj.getStarttime());
			st.setString(3, obj.getOwner());
			st.setString(4, obj.getDuration());
			
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
		public void update(Projetos obj) {
			PreparedStatement st = null;
			try {
				st = conn.prepareStatement(
						"UPDATE projetos "
						+ "SET taskname = ?, starttime = ?, owner = ?, duration = ?"
						+ "WHERE Id = ?");
				
				st.setString(1, obj.getTaskname());
				st.setString(2, obj.getStarttime());
				st.setString(3, obj.getOwner());
				st.setString(4, obj.getDuration());
				
				st.setInt(5, obj.getId());
				
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
			st = conn.prepareStatement("DELETE FROM projetos WHERE Id = ?");
			
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
	public Projetos findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
				"SELECT * FROM projetos WHERE Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Projetos obj = new Projetos();
				obj.setId(rs.getInt("Id"));
				obj.setTaskname(rs.getString("taskname"));
				obj.setStarttime(rs.getString("startime"));
				obj.setOwner(rs.getString("owner"));
				obj.setDuration(rs.getString("duration"));

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
