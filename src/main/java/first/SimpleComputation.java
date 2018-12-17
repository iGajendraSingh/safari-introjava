package first;

public class SimpleComputation {

  public static void main(String [] args) {
    // variables: must be declared before use
    // must be initialized before you read them
    // must have explicit (unchangeable "type")
    int a; // "identifiers" start with a letter, letters and numbers, and underscore _ follow
    int b = 100;
    a = 99;
    int result = a + b;

    // numbers in several types byte, short, int, long <== Integer type
    // floating point float, double
    float x = 1234.0F; // also 1.23E+6
    long y = 6_000_000_000L; // underscore separator 1,267 1.257

    System.out.println(result);

    // operators + - * / % (modulus / remainder)
    // comparisons < > <= >= != ==
    // logical && (and), || (or), ! (not)

    // in parens MUST be a "boolean" type... comparisons, or logical operations

//    if (x) {} // NOT allowed!!!
    if (x > 1200) {
      System.out.println("x is big");
    } else { // else is optional
      System.out.println("x is not big");
    }

    int index = 0;
    while (index < 3) { // test must be boolean!!!
      // plus (+) works with numbers, or with string concatenation
      // string concatenation might "convert" a second argument to String
      System.out.println("index is " + index);
//      index = index + 1;
//      index += 1;
      index++; // ++x x++ --x x--
    }
  }
}
