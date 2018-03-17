package com.ui;

import com.services.DateService;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class MainUi {

  private final static Logger logger = Logger.getLogger(MainUi.class);

  public static void main(String[] args) {
    logger.info("We are in the layer01_ui module.");
    logger.info("Input data:" + Arrays.toString(args));

    String output = "No input data";
    if (args.length > 0) {

      logger.info("Got input data and started processing");

      DateService dateService = new DateService();
      output = String.format("You entered: \"%s\".\nResult: %s", args[0],
          dateService.process(args[0]));
    }

    System.out.println();
    System.out.println(output);
    System.out.println();

    logger.info("Finished");
  }
}
