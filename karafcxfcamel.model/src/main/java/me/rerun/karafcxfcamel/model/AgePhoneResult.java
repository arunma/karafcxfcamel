package me.rerun.karafcxfcamel.model;

public class AgePhoneResult extends SearchResult {


    private int age;
    private String phone;

    public AgePhoneResult(){}

    public AgePhoneResult(int age, String phone) {
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
