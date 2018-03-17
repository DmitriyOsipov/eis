package com.processing;

import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

public class DateProcessor {

  private final static Logger logger = Logger.getLogger(DateProcessor.class);

  public String getDayName(Date date) {

    logger.info("We are in layer03_dao now. Income data: " + date);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    String result = chooseDayName(calendar.get(Calendar.DAY_OF_WEEK));

    logger.info("Result of layer03_dao is: " + result);

    return result;
  }

  private String chooseDayName(int number) {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday"};
    return daysOfWeek[number - 1];

  }
}
