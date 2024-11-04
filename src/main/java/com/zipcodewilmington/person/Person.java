package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
class Person {
    private String name;
    private int age;
    private String lastName;
    private String placeOfBirth;
    private String birthMonth;
    private String nationality;

//        String expectedName = "Tania";
//        int expectedAge = 30;
//
//        Person person = new Person("Tania", 30);
//        String actualName = person.getName();
//        int actualAge = person.getAge();



    public Person(String name, int age, String lastName, String placeOfBirth, String birthMonth, String nationality) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.placeOfBirth = placeOfBirth;
        this.birthMonth = birthMonth;
        this.nationality = nationality;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public  String getNationality() {
        return nationality;
    }
}


