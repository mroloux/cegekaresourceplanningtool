package controllers;

import models.Project;
import play.data.validation.Required;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void voegProjectToe(@Required String naam, String locatie) {
    	Project project = new Project();
    	project.naam = naam;
    	project.locatie = locatie;
    	project.save();
    	if(validation.hasErrors()) {
    		params.flash();
    		validation.keep();
    	} else {
    		flash.put("boodschap", "Project werd bewaard.");
    	}
    	index();
    }

}