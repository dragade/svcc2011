package com.dragade.svcc

class Partial {

  def say(greeting: String, name: String): String = {
    greeting + " " + name + " World1 "
  }

  def saywhat(greeting: String)(name: String): String = {
    greeting + " " + name + " World2 "
  }

}