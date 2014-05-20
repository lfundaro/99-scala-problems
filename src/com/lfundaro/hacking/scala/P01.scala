package com.lfundaro.hacking.scala

/**
 * Find the last element of a list.
 * 
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */
object P01 {
  
  /** Returns the last element of the list */
  def findLastCustom[T](x: List[T]): T = x match {
   case y :: Nil => y 
   case y :: ys => findLastCustom(ys)
   case Nil => throw new NoSuchElementException()
  }
  
  /** Returns the last element of the list 
   *  using the last method member from class
   *  List.
   */
  def findLast(x: List[Any]): Any = x.last
}