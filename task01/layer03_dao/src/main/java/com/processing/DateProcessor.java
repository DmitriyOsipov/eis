package com.processing;

import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.Logger;

public class DateProcessor {

  final static Logger logger = Logger.getLogger(DateProcessor.class);

  public String getDayName(Date date) {

    logger.info("We are in layer03_dao now. Income data:");
    logger.info(date);
    logger.info("Getting day of the week title.");

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);

    logger.info("Returning");

    return chooseDayName(calendar.get(Calendar.DAY_OF_WEEK));
  }

  private String chooseDayName(int number) {
    switch (number) {
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
      case 7:
        return "Saturday";
      default:
        return "Wrong day of week number";
    }
  }
}
