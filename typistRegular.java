package com.institute;

public class typistRegular extends typist{
    private float basicSalary;

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }
    protected static void displayTypistRegularDetails(float getSpeed ,float basicSalary, short code, String getName){
        System.out.println("-------------------------Details Of Casual Typist-");
        System.out.println("Name : "+getName);
        System.out.println("Daily Wages : "+basicSalary);
        System.out.println("Speed : " +getSpeed+"WPM");
        System.out.println("Code : " +code);
    }

}
