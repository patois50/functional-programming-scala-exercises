package com.patrickmcgeever.practise.hof

import com.patrickmcgeever.Fibonacci

/**
  * Created by pmcgeever on 30/12/2015.
  */
object Hof {

  def formatResult(name: String, n: Int, func: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, func(n))
  }

  def main(args: Array[String]) {
    formatResult("fibonacci", 10, Fibonacci.fib)
  }
}
