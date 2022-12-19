package com.institute;

public class teacher extends staff{
    protected String subject ="";
    protected char teachingClass ;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeachingClass(char teachingClass) {
        this.teachingClass = teachingClass;
    }
    protected void displayTeacherDetails(String subject, char teachingClass, short code, String getName){
        System.out.println("-------------------------Details Of Teacher-");
        System.out.println("Name : "+getName);
        System.out.println("Subject : "+subject);
        System.out.println("Code : " +code);
    }


}
