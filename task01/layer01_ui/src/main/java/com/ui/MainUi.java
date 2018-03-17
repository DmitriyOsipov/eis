package com.ui;

import com.services.DateService;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class MainUi {


  private final static Logger logger = Logger.getLogger(MainUi.class);

  public static void main(String[] args) {

    logger.info("We are in the layer01_ui module. Input data:" + Arrays.toString(args));

    try {
      DateService dateService = new DateService();
      System.out.println("This day is: " + dateService.process(args));
    } catch (IllegalArgumentException exc) {
      System.out.println("Date is invalid or format unrecognized");
    }
  }
}
