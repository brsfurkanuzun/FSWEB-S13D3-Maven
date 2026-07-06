package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    String gender;
    String job;
    String email;

    public Person(String firstName, String lastName, int age){
        this(firstName,lastName,age,null,null,null);
    }

    public Person(String firstName, String lastName, int age,String job, String gender, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
        this.email=email;
        this.job=job;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return 13<=age && age<=19;
    }
}
