package com.gametime.common;

import java.util.Calendar;

/**
 * Created by dave on 2/6/2017.
 */


public class Person {
    private final String firstName;
    private final String lastName;
    private final String height;
    private final String weight;
    private final Calendar dateOfBirth;


    public Person(String f, String l, String h, String w, Calendar dob) {
        firstName = f;
        lastName = l;
        height = h;
        weight = w;
        dateOfBirth = dob;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getHeight() {
        return height;
    }
    public String getWeight() {
        return weight;
    }
    public Calendar getDateOfBirth() { return dateOfBirth; }
}
