package com.dragade.svcc.java;

public final class Cat {
  private final String name;
  private final String breed;
  private final int age;

  public static Cat Cat(String name, String breed, int age) {
    return new Cat(name, breed, age);
  }

  public Cat(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public String getName() {

    return name;
  }

  public String getBreed() {
    return breed;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cat cat = (Cat) o;

    if (age != cat.age) return false;
    if (breed != null ? !breed.equals(cat.breed) : cat.breed != null) return false;
    if (name != null ? !name.equals(cat.name) : cat.name != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (breed != null ? breed.hashCode() : 0);
    result = 31 * result + age;
    return result;
  }

  @Override
  public String toString() {
    return "Cat(" + name + ',' + breed + ',' + age + ')';
  }
}


