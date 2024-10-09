package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();

        String jobName;
        if (name.isEmpty()) {
            jobName = "Data not available";
        } else {
            jobName = name;
        }

        String jobEmployer;
        if (employer.getValue().isEmpty()) {
            jobEmployer = "Data not available";
        } else {
            jobEmployer = employer.getValue();
        }

        String jobLocation;
        if (location.getValue().isEmpty()) {
            jobLocation = "Data not available";
        } else {
            jobLocation = location.getValue();
        }

        String jobPositionType;
        if (positionType.getValue().isEmpty()) {
           jobPositionType = "Data not available";
        } else {
            jobPositionType = positionType.getValue();
        }

        String jobCoreCompetency;
        if (coreCompetency.getValue().isEmpty()) {
            jobCoreCompetency = "Data not available";
        } else {
            jobCoreCompetency = coreCompetency.getValue();
        }

        return newLine +
                "ID: " + id + newLine +
                "Name: " + jobName + newLine +
                "Employer: " + jobEmployer + newLine +
                "Location: " + jobLocation + newLine +
                "Position Type: " + jobPositionType + newLine +
                "Core Competency: "  + jobCoreCompetency + newLine;

    }

}
