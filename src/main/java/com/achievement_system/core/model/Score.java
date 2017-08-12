package com.achievement_system.core.model;

public class Score implements Comparable<Score>{
    private Integer studentID;
    private String studentName;
    private Integer studentTotalScore;
    private Integer otmScore;
    private Integer asnScore;
    private Integer icbScore;
    private Integer clnScore;
    private Integer gddScore;
    private Integer gssScore;
    private Integer pgsScore;
    private Integer dspScore;
    private Integer hldScore;
    private Integer gpaScore;
    private Integer cmpScore;
    private Integer fmlScore;

    public Score() { }

    public void calculateTotalScore()
    {
        this.studentTotalScore = this.otmScore
                + this.asnScore
                + this.icbScore
                + this.clnScore
                + this.gddScore
                + this.gssScore
                + this.pgsScore
                + this.dspScore
                + this.hldScore
                + this.gpaScore
                + this.cmpScore
                + this.fmlScore;
    }

    public Integer getOtmScore() {
        return otmScore;
    }

    public void setOtmScore(Integer otmScore) {
        this.otmScore = otmScore;
    }

    public Integer getAsnScore() {
        return asnScore;
    }

    public void setAsnScore(Integer asnScore) {
        this.asnScore = asnScore;
    }

    public Integer getIcbScore() {
        return icbScore;
    }

    public void setIcbScore(Integer icbScore) {
        this.icbScore = icbScore;
    }

    public Integer getClnScore() {
        return clnScore;
    }

    public void setClnScore(Integer clnScore) {
        this.clnScore = clnScore;
    }

    public Integer getGddScore() {
        return gddScore;
    }

    public void setGddScore(Integer gddScore) {
        this.gddScore = gddScore;
    }

    public Integer getGssScore() {
        return gssScore;
    }

    public void setGssScore(Integer gssScore) {
        this.gssScore = gssScore;
    }

    public Integer getPgsScore() {
        return pgsScore;
    }

    public void setPgsScore(Integer pgsScore) {
        this.pgsScore = pgsScore;
    }

    public Integer getDspScore() {
        return dspScore;
    }

    public void setDspScore(Integer dspScore) {
        this.dspScore = dspScore;
    }

    public Integer getHldScore() {
        return hldScore;
    }

    public void setHldScore(Integer hldScore) {
        this.hldScore = hldScore;
    }

    public Integer getGpaScore() {
        return gpaScore;
    }

    public void setGpaScore(Integer gpaScore) {
        this.gpaScore = gpaScore;
    }

    public Integer getCmpScore() {
        return cmpScore;
    }

    public void setCmpScore(Integer cmpScore) {
        this.cmpScore = cmpScore;
    }

    public Integer getFmlScore() {
        return fmlScore;
    }

    public void setFmlScore(Integer fmlScore) {
        this.fmlScore = fmlScore;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentTotalScore() {
        return studentTotalScore;
    }

    public void setStudentTotalScore(Integer studentTotalScore) {
        this.studentTotalScore = studentTotalScore;
    }

    public int compareTo(Score compareRank) {

        int compareScore = ((Score) compareRank).getStudentTotalScore();

        //ascending order
//        return this.studentTotalScore - compareScore;

        //descending order
        return compareScore - this.studentTotalScore;

    }
}
