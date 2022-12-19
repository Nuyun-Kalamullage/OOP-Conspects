package com.institute;

public class officer extends staff{
    private String grade ="";

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    protected static void displayOfficerDetails(String grade, short code, String getName){
        System.out.println("-------------------------Details Of Officer-");
        System.out.println("Name : "+getName);
        System.out.println("Grade : "+grade);
        System.out.println("Code : " +code);
    }

}
