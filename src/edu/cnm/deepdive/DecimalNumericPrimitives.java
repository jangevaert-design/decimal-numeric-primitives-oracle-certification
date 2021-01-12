package edu.cnm.deepdive;

public class DecimalNumericPrimitives {

  public static void main(String[] args) {

//    float myNumber = 25.4; doesn't compile because 25.4 is a double. (put f or F after the number
//    or cast to float.

    float myNumber2 = 25.4f;

//    double before = 10_.25; doesn't compile. No underscores allowed just before or after the
//    the decimal point.

    double myDouble = 2.54;
    double myDouble2 = 2.54f;
    double anotherDouble = 2.45d; // for double but not needed.
    double scientific = 5.000125E03; //shift the decimal point 3 so 5000.125

    double hexPi = 0x1.91eb851eb851fp1;//p indicates hexadecimal floating point number
  }

}
