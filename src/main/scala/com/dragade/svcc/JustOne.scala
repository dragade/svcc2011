package com.dragade.svcc


/**
 * Singleton example
 */
object JustOne {

  val someResource = "justOne: " + this.toString

  def getResource = someResource

}