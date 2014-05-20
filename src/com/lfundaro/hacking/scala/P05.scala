package com.lfundaro.hacking.scala

/**
 * Reverse a list.
 * Example:
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object P05 {

  /**
   * Returns the reverse of the list.
   *
   * Note that we use the operator :: to take advantage
   * of the constant time that this operator offer
   * on lists, thus making the reverseList algorithm
   * O(n).
   */
  def reverseListCustom[A](x: List[A]): List[A] =
    x.foldLeft(List[A]())((r, c) => c :: r)

  def reverseList[A](x: List[A]): List[A] = x.reverse
}