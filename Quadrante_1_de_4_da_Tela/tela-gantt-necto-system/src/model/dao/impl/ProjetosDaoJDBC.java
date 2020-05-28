package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.ProjetosDao;
import model.entities.Projetos;

public class ProjetosDaoJDBC implements ProjetosDao {

	private Connection conn;
	
	public ProjetosDaoJDBC(Connection conn) {
		this.conn = conn;
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
				obj.setTaskname(rs.getString("Taskname"));
				obj.setStarttime(rs.getInt("Starttime"));
				obj.setOwner(rs.getString("Owner"));
				obj.setDuration(rs.getInt("Duration"));
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

	@Override
	public List<Projetos> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
				"SELECT * FROM projetos ORDER BY Name");
			rs = st.executeQuery();

			List<Projetos> list = new ArrayList<>();

			while (rs.next()) {
				Projetos obj = new Projetos();
				obj.setId(rs.getInt("Id"));
				obj.setTaskname(rs.getString("Taskname"));
				obj.setStarttime(rs.getInt("Starttime"));
				obj.setOwner(rs.getString("Owner"));
				obj.setDuration(rs.getInt("Duration"));
				list.add(obj);
			}
			return list;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public void insert(Projetos obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
				"INSERT INTO projetos " +
				"(Taskame) " +
				"VALUES " +
				"(Starttime) " +
				"VALUES " +
				"(Owner) " +
				"VALUES " +
				"(Duration) " +
				"VALUES " +
				"(?)", 
				Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getTaskname());

			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
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
				"UPDATE Projetos " +
				"SET Taskname = ? " +
				"SET Starttime = ? " +
				"SET Owner = ? " +
				"SET Duration = ? " +
				"WHERE Id = ?");

			st.setString(1, obj.getTaskname());
			st.setInt(2, obj.getId());

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
			st = conn.prepareStatement(
				"DELETE FROM projetos WHERE Id = ?");

			st.setInt(1, id);

			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
		}
	}
}