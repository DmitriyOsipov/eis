package com.services;

class DateFormatChecker {

  void validateInput(String[] data) {
    if (data.length < 1) {
      throw new IllegalArgumentException();
    }
  }

  void validateForFormat(String input) {
    if (!input.matches("\\d{1,2}-\\d{1,2}-\\d{1,4}")) {
      throw new IllegalArgumentException();
    }
  }

  void validateDatePars(int year, int month, int day) {
    int[] months31 = {1, 3, 5, 7, 8, 10, 12};
    int[] months30 = {4, 6, 9, 11};

    if (!((year > 0)
        && ((month == 2 && day <= ((year % 4 == 0) ? 29 : 28))
        || (contains(months30, month) && day <= 30)
        || (contains(months31, month) && day <= 31)))) {
      throw new IllegalArgumentException();
    }
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
