package controllers;

import javax.validation.Valid;

import models.Project;
import play.data.validation.Required;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
    	render();
    }
}