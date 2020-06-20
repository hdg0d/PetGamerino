package com.cs246.game;

public class Pet {
    private Boolean vaccinated;
    private Boolean fed;
    private Boolean exercised;
    private String name;

    public Pet() {
        vaccinated = false;
        fed = false;
        exercised = false;
    }
    public Pet(String name) {
        this.name = name;
        vaccinated = false;
        fed = false;
        exercised = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Boolean getFed() {
        return fed;
    }

    public void setFed(Boolean fed) {
        this.fed = fed;
    }

    public Boolean getExercised() {
        return exercised;
    }

    public void setExercised(Boolean exercised) {
        this.exercised = exercised;
    }
}
