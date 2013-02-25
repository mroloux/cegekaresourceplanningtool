package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Project extends Model {
	
	@Required
	public String naam;
	public String locatie;
	

}
