/**
Creating FizzBuzz program with Java
For multiples of 3, print "Fizz"
For multiples of 5, print "Buzz"
For multiples of 3 and 5, Print "FizzBuzz"
Else will print a number of i
**/

public class FizzBuzz {

  public static void main(String[] args) {

    // Code started here
    for (int i = 0; i <= 100; i ++) {
      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0 && i % 3 != 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else {
        System.out.println(i);
      }
    }
  }

}
