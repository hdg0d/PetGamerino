package com.cs246.game;

public class Cat extends Pet {
    //Condition trackers
    private Boolean hasPan;
    private Boolean hasCalic;
    private Boolean hasFLV;
    private Boolean hasRhino;

    public Boolean getHasPan() {
        return hasPan;
    }

    public void setHasPan(Boolean hasPan) {
        this.hasPan = hasPan;
    }

    public Boolean getHasCalic() {
        return hasCalic;
    }

    public void setHasCalic(Boolean hasCalic) {
        this.hasCalic = hasCalic;
    }

    public Boolean getHasRhino() {
        return hasRhino;
    }

    public void setHasRhino(Boolean hasRhino) {
        this.hasRhino = hasRhino;
    }

    public Boolean getHasFLV() {
        return hasFLV;
    }

    public void setHasFLV(Boolean hasFLV) {
        this.hasFLV = hasFLV;
    }
}
