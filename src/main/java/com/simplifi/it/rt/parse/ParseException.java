package com.simplifi.it.rt.parse;

public class ParseException extends Exception
{
  public ParseException(String message) {
    super(message);
  }

  public ParseException(Throwable cause) {
    super(cause);
  }

  public ParseException(String message, Throwable cause) {
    super(message, cause);
  }
}