package com.services;

import com.processing.DateProcessor;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Date;

public class DateService {

  private final static Logger logger = Logger.getLogger(DateService.class);

  public String process(String[] data) {

    logger.info("We are in layer02_service module now. Input data:" + Arrays.toString(data));

    DateFormatChecker validator = new DateFormatChecker();
    validator.validateInput(data);
    validator.validateForFormat(data[0]);

    String[] splitted = data[0].split("-");
    if (splitted.length != 3) {
      throw new IllegalArgumentException();
    }
    String result = this.processOkFormat(splitted);

    logger.info("Result of layer02_service is:" + result);

    return result;
  }

  private String processOkFormat(String[] parts) {
    DateParser parser = new DateParser();
    DateProcessor dateProcessor = new DateProcessor();
    Date date = parser.getDate(parts);
    return dateProcessor.getDayName(date);
  }
}