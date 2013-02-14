package models;

import org.fest.assertions.Assertions;
import org.junit.Test;

import play.test.UnitTest;

public class ProjectTest extends UnitTest {
	
	@Test
	public void projectKanWeggeschrevenWordenNaarDatabase() throws Exception {
		String locatie = "Leuven";
		String naam = "testProject";
		Project project = new Project();
		project.naam = "testProject";
		project.locatie = locatie;
		project.save();
		Assertions.assertThat(Project.<Project>findAll().get(0).locatie).isEqualTo(locatie);
		Assertions.assertThat(Project.<Project>findAll().get(0).naam).isEqualTo(naam);
	}

}
