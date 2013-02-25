package controllers;

import java.util.List;

import models.Project;
import play.data.validation.Valid;
import play.mvc.Controller;

public class Projecten extends Controller {
	
    public static void nieuw() {
    	Project project = new Project();
    	render(project);
    }
    
    public static void voegToe(@Valid Project project) {
    	if(validation.hasErrors()) {
    		params.flash();
    		validation.keep();
    	} else {
    		project.save();
    		flash.put("boodschap", "Project werd bewaard.");
    	}
    	nieuw();
    }
    
    public static void lijst() {
    	List<Project> projecten = Project.findAll();
        render(projecten);
    }
    
    public static void toon(Project project) {
    	render(project);
    }
    
    public static void wijzig(@Valid Project project) {
    	if(validation.hasErrors()) {
    		params.flash();
    		validation.keep();
    		toon(project);
//    		renderTemplate("Projecten/toon.html");
    	} else {
    		project.save();
    		flash.put("boodschap", "Project werd bewaard.");
    		lijst();
    	}
    }
}
