package com.cs246.game;

public class Dog extends Pet {
    //Condition trackers
    private Boolean hasParvo;
    private Boolean hasInfluenza;
    private Boolean hasCovid;
    private Boolean hasKCough;
    private Boolean hasLepto;
    private Boolean rattlesnakeBite;

    private String breed;

    //Getters and Setters
    public Boolean getHasParvo() {
        return hasParvo;
    }

    public void setHasParvo(Boolean hasParvo) {
        this.hasParvo = hasParvo;
    }

    public Boolean getHasInfluenza() {
        return hasInfluenza;
    }

    public void setHasInfluenza(Boolean hasInfluenza) {
        this.hasInfluenza = hasInfluenza;
    }

    public Boolean getHasCovid() {
        return hasCovid;
    }

    public void setHasCovid(Boolean hasCovid) {
        this.hasCovid = hasCovid;
    }

    public Boolean getHasKCough() {
        return hasKCough;
    }

    public void setHasKCough(Boolean hasKCough) {
        this.hasKCough = hasKCough;
    }

    public Boolean getHasLepto() {
        return hasLepto;
    }

    public void setHasLepto(Boolean hasLepto) {
        this.hasLepto = hasLepto;
    }

    public Boolean getRattlesnakeBite() {
        return rattlesnakeBite;
    }

    public void setRattlesnakeBite(Boolean rattlesnakeBite) {
        this.rattlesnakeBite = rattlesnakeBite;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
