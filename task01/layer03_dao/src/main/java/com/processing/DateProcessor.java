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
    calendar.setFirstDayOfWeek(Calendar.MONDAY);

    logger.info("Returning");

    return chooseDayName(calendar.get(Calendar.DAY_OF_WEEK));
  }

  private String chooseDayName(int number) {
    switch (number) {
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      case 7:
        return "Sunday";
      default:
        return "Wrong day of week number";
    }
  }
}
