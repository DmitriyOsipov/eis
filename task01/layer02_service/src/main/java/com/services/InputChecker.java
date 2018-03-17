package com.services;

class InputChecker {

  void validateInput(String[] data) {
    if (data.length < 1) {
      throw new IllegalArgumentException();
    }
  }
}
