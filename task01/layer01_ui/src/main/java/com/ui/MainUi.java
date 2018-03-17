package com.ui;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class MainUi {


  private final static Logger logger = Logger.getLogger(ServiceCaller.class);

  public static void main(String[] args) {

    logger.info("We are in the layer01_ui module. Input data:" + Arrays.toString(args));

    try {
      ServiceCaller serviceCaller = new ServiceCaller();
      System.out.println("This day is: " + serviceCaller.callServices(args));
    } catch (IllegalArgumentException exc) {
      System.out.println("Date is invalid or format unrecognized");
    }
  }
}
