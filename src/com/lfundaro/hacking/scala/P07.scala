package com.lfundaro.hacking.scala

/**
 * Flatten a nested list structure.
 * 
 * Example:
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object P07 {

  /** Returns a flatten list using builtin functions*/
  def flattenList[A](x: List[List[A]]): List[A] = x flatMap(y => y) 
}