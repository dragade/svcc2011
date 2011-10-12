package com.dragade.svcc.java;

import java.util.ArrayList;

public class Nulls {

  static class Person {
    public final Integer age;
    public final String name;

    public Person(Integer age, String name) {
      this.age = age;
      this.name = name;
    }
  }

  public static void main (String[] args) {
    ArrayList<Person> people = new ArrayList<Person> ();
    people.add(new Person(5, "Alfred"));
    people.add(new Person(null, "Bruce"));
    people.add(new Person(7, "Carole"));

    int sum = 0;
    for (Person p : people) {
        sum += p.age; //doh runtime NPE, no help from the compiler
    }
    System.out.println("Sum is " + sum);
  }

}
