package me.rerun.karafcxfcamel.model;

public class NameEmailResult extends SearchResult {

    private String name;
    private String email;

    public NameEmailResult(){}

    public NameEmailResult(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
