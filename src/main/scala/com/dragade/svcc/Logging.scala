package com.dragade.svcc

trait Logging {
  lazy val log = Logger.getLogger(this.getClass.getName)

  def logIfDebug(something: => String) {
    if (log.isDebugEnabled) {
      try {
        log.debug(something)
      } catch {
        case e: Exception =>
          log.error(e)
      }
    }
  }
}


//simulate log4j
object Logger {
  def getLogger(s: String) = this

  var isDebugEnabled = true

  def debug(s: String) {
    println("Debugging " + s)
  }

  def error(e: Exception) {
    println("Got exception: " + e.getClass.getName)
  }
}
