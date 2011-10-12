package com.dragade.svcc

object TupleExample {

  def firstMiddleLast(name: String): (String, String, String) = {
    val parts = name.split(" ")
    val fname = parts(0)
    val middle = parts(1)
    val last = parts(2)
    (fname, middle, last)
  }
}