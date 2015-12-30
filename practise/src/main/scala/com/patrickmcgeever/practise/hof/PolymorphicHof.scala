package com.patrickmcgeever.practise.hof

/**
 * Created by pmcgeever on 30/12/2015.
 * Polymorphic in the context of this example/functional programming meaning the ability to operate with any type
 *
 */
object PolymorphicHof {

  def findFirst[A](arr: Array[A], f: A => Boolean): Int = {
    // Condition when should unsuccessfully exit the loop
    // Condition when found
    // Condition when not found
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= arr.length) -1
      else if (f(arr(n))) n
      else loop(n + 1)
    }
    loop(0)
  }

  def main(args: Array[String]) {
    val arr: Array[String] = Array("a", "b", "c")
    val s: String = "bd"

    println("The first occurance of \"%s\" in array [%s] in at pos %s".format(s,
      arr,
      findFirst(arr, (ss: String) => if(ss == s)true else false)))
  }
}
