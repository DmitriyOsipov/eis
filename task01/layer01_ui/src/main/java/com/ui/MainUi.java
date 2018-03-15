package com.ui;

import com.services.DateService;

public class MainUi {

  public static void main(String[] args) {
    String output = "No input data";
    if (args.length > 0) {
      DateService dateService = new DateService();
      output = String.format("You entered: \"%s\".\nResult: %s", args[0],
          dateService.process(args[0]));
    }
    System.out.println(output);
  }
}
