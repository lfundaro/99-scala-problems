package com.lfundaro.hacking.scala

/**
 * Pack consecutive duplicates of list elements into sublists.
 *
 * If a list contains repeated elements they should be placed in
 * separate sublists.
 * Example:
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c),
 *                                      List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */
object P09 {

  def pack[A](list: List[A]): List[List[A]] = {
    list.foldRight(List[List[A]]()) { (a, z) =>
      z match {
        case List() => List(List(a))
        case y :: ys =>
          if (y.head == a) {
            (a :: y) :: ys
          } else {
            List(a) :: y :: ys
          }
      }
    }
  }
}