package com.ui;

import com.services.DateService;

class ServiceCaller {


  String callServices(String[] runArgs) {

    DateService dateService = new DateService();
    return dateService.process(runArgs);
  }

}
