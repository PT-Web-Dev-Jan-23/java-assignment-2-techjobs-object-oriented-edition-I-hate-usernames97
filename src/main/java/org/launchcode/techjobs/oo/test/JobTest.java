package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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
    Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Product tester", testJob1.getName());
    assertTrue(testJob1.getName() instanceof String);

    assertEquals("ACME", testJob1.getEmployer().getValue());
    assertTrue(testJob1.getEmployer() instanceof Employer);

    assertEquals("Desert", testJob1.getLocation().getValue());
    assertTrue(testJob1.getLocation() instanceof Location);

    assertEquals("Quality control", testJob1.getPositionType().getValue());
    assertTrue(testJob1.getPositionType() instanceof PositionType);

    assertEquals("Persistence", testJob1.getCoreCompetency().getValue());
    assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
}
@Test
public void testJobsForEquality(){
   Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(testJob1.equals(testJob2));
}

@Test
public void testToStringStartsAndEndsWithNewLine(){
    Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    char testCharStart = testJob1.toString().charAt(0);
    char testCharEnd = testJob1.toString().charAt(testJob1.toString().length() - 1);

    assertEquals('\n' , testCharStart);
    assertEquals('\n', testCharEnd);
}

@Test
public void testToStringContainsCorrectLabelsAndData(){
    Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String testString = testJob1.toString();
    assertEquals(testString, testJob1.toString());

}

    @Test
    public void testToStringHandlesEmptyField() {

        Job testJob = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String emptyString = testJob.toString();
        assertEquals(emptyString, testJob.toString());
    }
}
