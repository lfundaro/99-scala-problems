package com.lfundaro.hacking.scala

/**
 * Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 */
object P04 {

  /** Returns the length of the list */
  def listLengthCustom[T](x: List[T]): Int = {
    def findLength[T](n: Int, curr: List[T]): Int =
      if (curr.isEmpty) n
      else findLength(n + 1, curr.tail)
      
    findLength(0, x)
  }
  
  /** Returns the length of the list using builtin functions */
  def listLength[A](x: List[A]): Int = x.length

}