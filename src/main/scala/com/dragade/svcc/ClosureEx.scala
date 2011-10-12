package com.dragade.svcc

/**
 * Created by IntelliJ IDEA.
 * User: dragade
 * Date: 10/8/11
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */

object ClosureEx {

  def createClosure() = {
    var score = 0; //will be mutated by closure
    val closure = (f: String) => {
      f match {
        case "grape" => score += 5
        case "apple" => score += 2
        case _ => score += 1
      }
      println("Fruit %s Score is %d".format(f, score))
    }
    closure
  }

  def main(args: Array[String]) {
    val closure = createClosure
    val fruits = List("grape", "orange", "apple", "cherry")
    fruits.foreach(closure)
  }

}