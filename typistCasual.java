package com.institute;

public class typistCasual extends typist{
    private float dailyWages;

    public float getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(float dailyWages) {
        this.dailyWages = dailyWages;
    }
    protected static void displayTypistCasualDetails(float getSpeed ,float dailyWages, short code, String getName){
        System.out.println("-------------------------Details Of Casual Typist-");
        System.out.println("Name : "+getName);
        System.out.println("Daily Wages : "+dailyWages);
        System.out.println("Speed : " +getSpeed+"WPM");
        System.out.println("Code : " +code);
    }
}
