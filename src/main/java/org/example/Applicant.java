package org.example;

public class Applicant {
    private String name;
    private int age;
    private boolean valid;

    public Applicant(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isValid() {
        return valid;
    }
    public void setValid(boolean valid) { this.valid = valid; }
}
