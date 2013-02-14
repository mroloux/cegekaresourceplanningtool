package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Project extends Model {
	
	public String naam;
	public String locatie;
	

}
