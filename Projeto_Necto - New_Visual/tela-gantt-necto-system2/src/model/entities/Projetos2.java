package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Projetos2 implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String titleproject;
	private Date duration;
	private String projectcol;
	

	
	public Projetos2() {
		
	}

	public Projetos2(Integer id, String titleproject, Date duration, String projectcol) {
		super();
		this.id = id;
		this.titleproject = titleproject;
		this.duration = duration;
		this.projectcol = projectcol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitleproject() {
		return titleproject;
	}

	public void setTitleproject(String titleproject) {
		this.titleproject = titleproject;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getProjectcol() {
		return projectcol;
	}

	public void setProjectcol(String projectcol) {
		this.projectcol = projectcol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projetos2 other = (Projetos2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Projetos2 [id=" + id + ", titleproject=" + titleproject + ", duration=" + duration + ", projectcol="
				+ projectcol + "]";
	}
	
	
	}