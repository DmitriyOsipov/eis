package com.services;

import com.processing.DateProcessor;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateService {

  private final static Logger logger = Logger.getLogger(DateService.class);

  public String process(String[] data) {

    logger.info("We are in layer02_service module now. Input data:" + Arrays.toString(data));

    InputChecker validator = new InputChecker();
    validator.validateInput(data);

    String result = this.runDateProcessor(data[0]);

    logger.info("Result of layer02_service is:" + result);

    return result;
  }

  private String runDateProcessor(String data) {
    DateProcessor dateProcessor = new DateProcessor();
    SimpleDateFormat dateFormat = new SimpleDateFormat("d-M-y");
    dateFormat.setLenient(false);

    Date date;
    try {
      date = dateFormat.parse(data);
    } catch (ParseException parseExc) {
      throw new IllegalArgumentException();
    }

    return dateProcessor.getDayName(date);
  }
}