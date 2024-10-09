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
        String newLine = System.lineSeparator();
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = myJob1.toString();

        assertTrue(jobString.startsWith(newLine));
        assertTrue(jobString.endsWith(newLine));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String newLine = System.lineSeparator();
        String line = "_______";

        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedResult1 = newLine +
                "ID: " + myJob1.getId() + " " + line + newLine +
                "Name: " + myJob1.getName() + " " + line + newLine +
                "Employer: " + myJob1.getEmployer().getValue() + " " + line + newLine +
                "Location: " + myJob1.getLocation().getValue() + " " + line + newLine +
                "PositionType: " + myJob1.getPositionType().getValue() + " " + line + newLine +
                "CoreCompetency: " + myJob1.getCoreCompetency().getValue() + " " + line + newLine;
        assertEquals(expectedResult1, myJob1.toString());

    }


    @Test
    public void testToStringHandlesEmptyField() {
        String newLine = System.lineSeparator();
        String line = "_______";

        Job myJob2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedResult2 = newLine +
                "ID: " + myJob2.getId() + " " + line + newLine +
                "Name: Data not available" + line + newLine +
                "Employer: Data not available " + line + newLine +
                "Location: Data not available " + line + newLine +
                "PositionType: Data not available " + line + newLine +
                "CoreCompetency: Data not available " + line + newLine;
        assertEquals(expectedResult2, myJob2.toString());
    }

}


