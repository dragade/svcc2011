package com.dragade.svcc

object RegEx {

  def main(args: Array[String]): Unit = {

    val QuoteRE = """^To (\S+) is human, to (\S+) divine\.$""".r

    val quotes = List(
      "To iterate is human, to recurse divine.",
      "To compile is human, to commit divine.",
      "foo bar baz"
    )

    quotes.foreach(s => {
      s match {
        case QuoteRE(human, divine) => printf("MATCHED %s , %s ", human, divine)
        case _ => printf("FAILED to find match in '%s'", s)
      }
      println()
    })

    //output:
    //MATCHED iterate , recurse
    //MATCHED compile , commit
    //FAILED to find match in 'foo bar baz'
  }
}