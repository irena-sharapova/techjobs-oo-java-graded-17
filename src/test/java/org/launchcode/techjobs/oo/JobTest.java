package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertNotEquals;

public class JobTest {

    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertNotEquals(System.identityHashCode(obj1), System.identityHashCode(obj2), "Object IDs should be distinct");
    }

    @Test
    public void testJobConstructorSetsAllFields () {
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


    }


