package datestuff;

public class MyDate {
  // boolean is a type! represents true or false (nothing else)
  public static boolean isLeapYear(int year) {
//    boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
//    return isLeap;
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    int daysInMonth;
    switch (month) {
      case 9:
      case 4:
      case 6:
      case 11:
        daysInMonth = 30;
        break;
      case 2:
//        if (isLeapYear(year)) {
//          daysInMonth = 29;
//        } else {
//          daysInMonth = 28;
//        }
        daysInMonth = (isLeapYear(year)) ? 29 : 28;
        break;
      default:
        daysInMonth = 31;
        break;
    }
    return daysInMonth;
  }
}
