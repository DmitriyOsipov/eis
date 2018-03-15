package com.services;

import com.processing.DateProcessor;

import java.util.Date;

public class DateService {

  private String message = "Date is invalid or format unrecognized";

  public String process(String data) {
    String result = message;
    DateFormatChecker validator = new DateFormatChecker();
    if (validator.validate(data)) {
      String[] splitted = data.split("-");
      if (splitted.length == 3) {
        result = this.processOkFormat(splitted);
      }
    }
    return result;
  }

  private String processOkFormat(String[] parts) {
    DateParser parser = new DateParser();
    DateProcessor dateProcessor = new DateProcessor();
    Date date = parser.getDate(parts);
    if (date != null) {
      return dateProcessor.getDayName(date);
    } else {
      return message;
    }
  }
}