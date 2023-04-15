package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.security.spec.ECField;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {




@Test
public void testSettingJobId(){

    Job testJobEmpty= new Job();
    Job testJobEmpty2 = new Job();

    assertNotEquals(testJobEmpty, testJobEmpty2);
}

@Test
public void testJobConstructorSetsAllFields(){

    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Product tester", testJob.getName());
    assertTrue(testJob instanceof Job);

    assertEquals("ACME", testJob.getEmployer().getValue());
    assertTrue(testJob.getEmployer() instanceof Employer);

    assertEquals("Desert", testJob.getLocation().getValue());
    assertTrue(testJob.getLocation() instanceof Location);

    assertEquals("Quality control", testJob.getPositionType().getValue());
    assertTrue(testJob.getPositionType() instanceof PositionType);

    assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
}
@Test
public void testJobsForEquality(){

    Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(testJob1.equals(testJob2));
}

}
