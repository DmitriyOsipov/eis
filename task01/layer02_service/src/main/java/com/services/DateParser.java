package com.services;

import java.util.Date;

class DateParser {

  Date getDate(String[] parts) {
    int day, month, year;

    try {
      day = Integer.valueOf(parts[0]);
      month = Integer.valueOf(parts[1]);
      year = Integer.valueOf(parts[2]);
    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException();
    }
    return this.parse(year, month, day);
  }

  private Date parse(int year, int month, int day) {
    DateFormatChecker validator = new DateFormatChecker();
    validator.validateDatePars(year, month, day);
    return new Date(year - 1900, month - 1, day);
  }
}
