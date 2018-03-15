package com.services;

import java.util.Date;

class DateParser {

  Date getDate(String[] parts) {
    int day, month, year;
    DateFormatChecker validator = new DateFormatChecker();
    try {
      day = Integer.valueOf(parts[0]);
      month = Integer.valueOf(parts[1]);
      year = Integer.valueOf(parts[2]);
      if (!validator.validate(year, month, day)) {
        return null;
      }
    } catch (NumberFormatException ex) {
      return null;
    }
    return this.parse(year, month, day);
  }

  private Date parse(int year, int month, int day) {
    return new Date(year, month, day);
  }
}
