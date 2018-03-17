package com.services;

import org.apache.log4j.Logger;

class DateFormatChecker {

  private final static Logger logger = Logger.getLogger(DateFormatChecker.class);

  boolean validate(String input) {
    logger.info("Checking input data for the date format by regex \"\\\\d{2}-\\\\d{2}-\\\\d{4}\"");
    return (input.matches("\\d{2}-\\d{2}-\\d{4}"));
  }

  boolean validate(int year, int month, int day) {
    logger.info("Checking parsed values of year, month and day");
    int[] months31 = {1, 3, 5, 7, 8, 10, 12};
    int[] months30 = {4, 6, 9, 11};

    return (year > 0)
        && ((month == 2 && day <= ((year % 4 == 0) ? 29 : 28))
        || (contains(months30, month) && day <= 30)
        || (contains(months31, month) && day <= 31));
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
