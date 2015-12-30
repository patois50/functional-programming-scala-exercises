package com.patrickmcgeever.exercise

/**
 * Created by pmcgeever on 30/12/15.
 */
object Currying {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  // In the obove the types of 'a' and 'b' can be inferred so it can be simplified as such...
  def curry2[A,B,C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  def main(args: Array[String]) {

  }

}
