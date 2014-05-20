package com.lfundaro.hacking.scala

/**
 * Find the last but one element of a list.
 *
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object P02 {

  /** Returns the penultimate using pattern marching */
  def penultimateCustom[T](x: List[T]): T = x match {
    case y :: z :: Nil => y
    case y :: ys => penultimateCustom(ys)
    case _ => throw new NoSuchElementException
  }

  /** Returns the penultimate using builtin functions */
  def penultimate[T](x: List[T]): T = {
    if (x.isEmpty) throw new NoSuchElementException
    else x.init.last
  }

}