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

    Job testJob1;
    Job testJob2;

@Before
public void testData(){

    testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}


@Test
public void testSettingJobId(){

    Job testJobEmpty= new Job();
    Job testJobEmpty2 = new Job();

    assertNotEquals(testJobEmpty, testJobEmpty2);
}

@Test
public void testJobConstructorSetsAllFields(){

    String spec = "testing the full Constructor sets all fields ";
    assertEquals(spec, "Product tester", testJob1.getName());
    assertTrue(spec, testJob1 instanceof Job);

    assertEquals(spec, "ACME", testJob1.getEmployer().getValue());
    assertTrue(spec, testJob1.getEmployer() instanceof Employer);

    assertEquals(spec, "Desert", testJob1.getLocation().getValue());
    assertTrue(spec, testJob1.getLocation() instanceof Location);

    assertEquals(spec, "Quality control", testJob1.getPositionType().getValue());
    assertTrue(spec, testJob1.getPositionType() instanceof PositionType);

    assertEquals(spec, "Persistence", testJob1.getCoreCompetency().getValue());
    assertTrue(spec, testJob1.getCoreCompetency() instanceof CoreCompetency);
}
@Test
public void testJobsForEquality(){
    assertFalse(testJob1.equals(testJob2));
}

@Test
public void testToStringStartsAndEndsWithNewLine(){

    String spec = " Job class toString starts and ends with new line";

    char testCharStart = testJob1.toString().charAt(0);
    char testCharEnd = testJob1.toString().charAt(testJob1.toString().length() - 1);

    assertEquals(spec, '\n' , testCharStart);
    assertEquals(spec, '\n', testCharEnd);
}

@Test
public void testToStringContainsCorrectLabelsAndData(){
    String spec = " Job class toString ";
    String testString = testJob1.toString();
    assertEquals(spec, testString, testJob1.toString());
}

}
