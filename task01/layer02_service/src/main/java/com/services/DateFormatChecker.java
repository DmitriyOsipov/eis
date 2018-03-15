package com.services;

class DateFormatChecker {

  boolean validate(String input) {
    return (input.matches("\\d{2}-\\d{2}-\\d{4}"));
  }

  boolean validate(int year, int month, int day) {
    int[] months31 = {1, 3, 5, 7, 8, 10, 12};
    int[] months30 = {4, 6, 9, 11};

    return (year > 0)
        && ((month == 2 && day == ((year % 4 == 0) ? 29 : 28))
        || (contains(months30, month) && day == 30)
        || (contains(months31, month) || day == 30));
  }

  private boolean contains(int[] array, int seek) {
    for (int num : array) {
      if (num == seek) {
        return true;
      }
    }
    return false;
  }
}
