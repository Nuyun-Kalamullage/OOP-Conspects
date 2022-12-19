package com.institute;



public class Main {
    public static void main(String args[]){

        teacher t1 = new teacher();
        teacher t2 = new teacher();
        officer o1 = new officer();
        officer o2 = new officer();
        typistRegular ty1 = new typistRegular();
        typistCasual ty2 =new typistCasual();

// entering the values to objects that i created
       t1.setName("nuyun Kalamullage");
       t1.setSubject("ICT");
       t1.setTeachingClass('A');
       t1.code = 001;

       t2.setName("Harndu Mansaka");
       t2.setSubject("English");
       t2.setTeachingClass('C');
       t2.code = 002;

       o1.setName("Sithum Vihanga");
       o1.setGrade("CEO");
       o1.code = 003;

       o2.setName("Chathumini Kavishaya");
       o2.setGrade("General Manager");
       o2.code = 004;

       ty1.setName("Dulan Pabasara");
       ty1.setSpeed(216);
       ty1.setBasicSalary(25_000);
       ty1.code = 005;

       ty2.setName("Kithmi Kavithma");
       ty2.setSpeed(1950);
       ty2.setDailyWages(950);
       ty2.code = 006;

// printing the values that i set before
        t1.displayTeacherDetails(t1.subject, t1.teachingClass, t1.code, t1.getName());
        t2.displayTeacherDetails(t2.subject, t2.teachingClass, t2.code, t2.getName());
        o1.displayOfficerDetails(o1.getGrade(), o1.code, o1.getName());
        o2.displayOfficerDetails(o2.getGrade(), o2.code, o2.getName());
        ty1.displayTypistRegularDetails(ty1.getSpeed(), ty1.getBasicSalary(), ty1.code, ty1.getName());
        ty2.displayTypistCasualDetails(ty2.getSpeed(), ty2.getDailyWages(), ty2.code, ty2.getName());

    }
}
