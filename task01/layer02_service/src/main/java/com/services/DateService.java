package com.services;

import com.processing.DateProcessor;

import org.apache.log4j.Logger;

import java.util.Date;

public class DateService {

  final static Logger logger = Logger.getLogger(DateService.class);

  private String message = "Date is invalid or format unrecognized";

  public String process(String data) {

    logger.info("We are in layer02_service module now. Input data:");
    logger.info(data);
    logger.info("Processing input data");

    String result = message;
    DateFormatChecker validator = new DateFormatChecker();
    if (validator.validate(data)) {
      String[] splitted = data.split("-");
      if (splitted.length == 3) {
        result = this.processOkFormat(splitted);
      }
    }

    logger.info("Returning");

    return result;
  }

  private String processOkFormat(String[] parts) {

    logger.info("Input string splitted normally. Begin parsing");

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