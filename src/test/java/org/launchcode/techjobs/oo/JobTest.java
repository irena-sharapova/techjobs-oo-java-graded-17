package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.print.attribute.standard.JobName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertNotEquals;

public class JobTest {

    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job obj1 = new Job();
        Job obj2 = new Job();

        assertNotEquals(obj1.getId(), obj2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(myJob.getName() instanceof String);
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertTrue(myJob.getLocation() instanceof Location);
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", myJob.getName());
        assertEquals("ACME", myJob.getEmployer().getValue());
        assertEquals("Desert", myJob.getLocation().getValue());
        assertEquals("Quality control", myJob.getPositionType().getValue());
        assertEquals("Persistence", myJob.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job myJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(myJob1, myJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String newline = System.lineSeparator();
        String line = "_______";

        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedResult1 = newline +
                "ID: " + myJob1.getId() + " " + line + newline +
                "Name: " + myJob1.getName() + " " + line + newline +
                "Employer: " + myJob1.getEmployer().getValue() + " " + line + newline +
                "Location: " + myJob1.getLocation().getValue() + " " + line + newline +
                "PositionType: " + myJob1.getPositionType().getValue() + " " + line + newline +
                "CoreCompetency: " + myJob1.getCoreCompetency().getValue() + " " + line + newline;
        assertEquals(expectedResult1, myJob1.toString());

    }


    @Test
    public void testToStringHandlesEmptyField() {
        String newline = System.lineSeparator();
        String line = "_______";

        Job myJob2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedResult2 = newline +
                "ID: " + myJob2.getId() + " " + line + newline +
                "Name: Data not available" + line + newline +
                "Employer: Data not available " + line + newline +
                "Location: Data not available " + line + newline +
                "PositionType: Data not available " + line + newline +
                "CoreCompetency: Data not available " + line + newline;
        assertEquals(expectedResult2, myJob2.toString());
    }

}


