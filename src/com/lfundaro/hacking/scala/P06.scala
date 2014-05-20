package com.lfundaro.hacking.scala

/**
 * Find out whether a list is a palindrome.
 * Example:
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 */
object P06 {

  /** Returns true if palindrome otherwise false.
   *  
   *  For a palindrome the following condition should 
   *  be met: 
   *  List(A) == reverse(List(A))
   */
  def isPalindrome[A](x: List[A]): Boolean = 
    x == P05.reverseListCustom(x)
  
}