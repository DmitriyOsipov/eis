package com.processing;

import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

public class DateProcessor {

  private final static Logger logger = Logger.getLogger(DateProcessor.class);

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
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday"};
    return daysOfWeek[number - 1];

  }
}
