package com.patrickmcgeever

/**
  * Created by pmcgeever on 29/12/2015.
  */
object Fibonacci {


  /** This method counts up passing the current pos into the recursive function as well as the last and current no */
  /** Assuming that the first element in the sequence is pos1 = 0 */
  def fib(n: Int): Int = {
    def go(n1: Int, n2: Int, i: Int): Int =
      if (i == n) n2
      else go(n1 + n2, n1, i + 1)
    go(1, 0, 1)
  }

  /** This method counts down passing the current pos into the recursive function as well as the last and current no */
  /** Assuming that the first element in the sequence is pos0 = 0 */
  def fib2(n: Int): Int = {
    def go(n: Int, prev: Int, curr: Int): Int =
      if (n == 0) prev
      else go(n - 1, curr, prev + curr)

    go(n, 0, 1)
  }

  def main(args: Array[String]) {
    val no = 8
    println("The value of pos %d in the fibonacci sequence is %d".format(no, fib2(no)))
  }

}
