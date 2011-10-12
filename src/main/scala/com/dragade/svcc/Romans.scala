package com.dragade.svcc

object Romans {
  val romans = Map(1 -> "I", 2 -> "II", 3 -> "III",
    4 -> "IV", 5 -> "V", 10 -> "X")

  implicit def intToRoman(x: Int) = new Roman(x)

  def printRomanSize(x: Int) {
    val msg = "%d has %d Roman letters."
    println(msg.format(x, x.getRomanSize))
  }

  def main(args: Array[String]) {
    romans.keys.foreach(printRomanSize)
  }
}

class Roman(val num: Int) {
  val romanVal = Romans.romans.getOrElse(num, "")

  def getRomanSize = romanVal.size
}


