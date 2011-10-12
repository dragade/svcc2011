package com.dragade.svcc

import _root_.java.util.Date


class HelloWorld(val name: String) {

  val dateCreated = new Date

  def sayHello {
    println(helloMessage("whoeverYouAre"))
  }

  def helloMessage(greetee: String = "Dear Human"): String = {
    val msg = "%s says: Hello %s, I was born on %s."
    msg.format(name, greetee, dateCreated)
  }
}