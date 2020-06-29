package com.cs246.game;

public class Pet {
    //Age in weeks for Spay and Neuter age
    public static final int spay_neut_age = 24;
    //Age in weeks for vaccines to start (can be 6-8 weeks old)
    public static final int vacc_age = 6;

    //Booleans for general health
    private Boolean exam;
    private Boolean vaccinated;
    private Boolean spayNeut;
    private Boolean dental;
    private Boolean fed;
    private Boolean exercised;

    //Booleans for if they have health conditions
    private Boolean hasParasite;
    private Boolean hasDistemper;

    //General info
    private String name;
    private int ageWks;
    private float id;

    public Pet() {
        vaccinated = false;
        fed = false;
        exercised = false;
        spayNeut = false;
        exam = false;
        dental = false;
    }
    public Pet(String name) {
        this.name = name;
        vaccinated = false;
        fed = false;
        exercised = false;
    }

    public Boolean getExam() {
        return exam;
    }

    public void setExam(Boolean exam) {
        this.exam = exam;
    }

    public Boolean getSpayNeut() {
        return spayNeut;
    }

    public void setSpayNeut(Boolean spayNeut) {
        this.spayNeut = spayNeut;
    }

    public Boolean getDental() {
        return dental;
    }

    public void setDental(Boolean dental) {
        this.dental = dental;
    }

    public Boolean getHasParasite() {
        return hasParasite;
    }

    public void setHasParasite(Boolean hasParasite) {
        this.hasParasite = hasParasite;
    }

    public Boolean getHasDistemper() {
        return hasDistemper;
    }

    public void setHasDistemper(Boolean hasDistemper) {
        this.hasDistemper = hasDistemper;
    }

    public int getAgeWks() {
        return ageWks;
    }

    public void setAgeWks(int ageWks) {
        this.ageWks = ageWks;
    }

    public float getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
