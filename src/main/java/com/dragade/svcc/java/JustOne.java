package com.dragade.svcc.java;

/**
 * Java Singleton example
 */
  public final class JustOne {

    private static final JustOne instance = new JustOne();

    private final String someResource;

    private JustOne() {
        someResource = "justOne: " + this.toString();
    }

    public String getResource() {
        return someResource;
    }

    public static JustOne getInstance() {
        return instance;
    }
  }