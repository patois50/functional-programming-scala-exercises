package com.patrickmcgeever.exercise

/**
 * Created by pmcgeever on 30/12/15.
 */
object IsSorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean =
      if (n >= as.length) true
      else if (ordered(as(n - 1), as(n))) loop(n + 1)
      else false

    // Start from the first element so that it can sort the first 2 elements on the first iteration
    loop(1)
  }

  def formatBooleanAnswer(b: Boolean): String = if(b) "is" else "is not"

  def main(args: Array[String]) {
    val arr: Array[Int] = Array()
    println("The array %s sorted".format(formatBooleanAnswer(isSorted(arr, (a: Int, b: Int) => if(a.compare(b)
      <= 0) true else false))))
  }

}
