package com.dragade.svcc

import scala.collection.mutable.HashMap

object CollEx {

  def printVotes(pair: (String, Int)) {
    val (person, numVotes) = pair
    println("%s got %d votes".format(person, numVotes))
  }

  def main(args: Array[String]) {
    val votes = List(("Bob", 13), ("Ann", 3), ("Maria", 18))
    votes.foreach(printVotes)

    val topVotes = votes.filter {
      case (name, num) => num > 5
    }

    val hm = new HashMap[String, Int]
    topVotes.foreach {
      case (name, num) => hm.put(name, num)
    }
    println(hm.toString) //Map(Maria -> 18, Bob -> 13)
  }
}

