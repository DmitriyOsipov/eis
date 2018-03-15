package com.processing;

import java.util.Calendar;
import java.util.Date;

public class DateProcessor {

  public String getDayName(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.setFirstDayOfWeek(Calendar.MONDAY);
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
