package com.services;

import java.util.Date;
import org.apache.log4j.Logger;

class DateParser {

  final static Logger logger = Logger.getLogger(DateParser.class);

  Date getDate(String[] parts) {
    logger.info("Parsing splitted string to the Date object");
    int day, month, year;
    DateFormatChecker validator = new DateFormatChecker();
    try {
      day = Integer.valueOf(parts[0]);
      month = Integer.valueOf(parts[1]);
      year = Integer.valueOf(parts[2]);
      if (!validator.validate(year, month, day)) {
        logger.info("Some values of year, month and day are invalid and parser returns no date");
        return null;
      }
    } catch (NumberFormatException ex) {
      logger.info("Some values in input string are not a numbers and parser returns no date");
      return null;
    }
    return this.parse(year, month, day);
  }

  private Date parse(int year, int month, int day) {
    logger.info("Creating a new Date object from parsed values");
    return new Date(year, month, day);
  }
}
