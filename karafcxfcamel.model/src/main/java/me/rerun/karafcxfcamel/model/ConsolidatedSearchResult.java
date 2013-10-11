package me.rerun.karafcxfcamel.model;

public class ConsolidatedSearchResult {

    private NameEmailResult nameEmailResult;
    private AgePhoneResult agePhoneResult;

    public NameEmailResult getNameEmailResult() {
        return nameEmailResult;
    }

    public void setNameEmailResult(NameEmailResult nameEmailResult) {
        this.nameEmailResult = nameEmailResult;
    }

    public AgePhoneResult getAgePhoneResult() {
        return agePhoneResult;
    }

    public void setAgePhoneResult(AgePhoneResult agePhoneResult) {
        this.agePhoneResult = agePhoneResult;
    }
}
