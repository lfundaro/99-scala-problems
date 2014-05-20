package com.lfundaro.hacking.scala

/**
 * Find the Kth element of a list.
 *
 * By convention, the first element in the list is element 0.
 * Example:
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 */
object P03 {

  /** Returns the kth element of a list */
  def findKthElementCustom[A](nth: Int, x: List[A]): A = x match {
    case Nil => throw new NoSuchElementException
    case _ =>
      if (nth < 0 || x.length < nth) {
        throw new NoSuchElementException
      } else {
        if (nth == 0) x.head
        else findKthElementCustom(nth - 1, x.tail)
      }
  }

  /** Returns the kth element using a builtin functions */
  def findKthElement[A](nth: Int, x: List[A]): A =
    if (nth < 0 || nth > x.length || x.isEmpty)
      throw new NoSuchElementException
    else
      x drop (nth) head
}