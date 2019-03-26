package org.common;

import java.util.Optional;

public class BusinessClass {

  private Double THRESHHOLD = 0.5;
  public static boolean isMeetingRequirement(Double d)  {
    
    // let thread sleep for a certain time
    // to demonstrate a time intensive test.
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      return false;
    }
    return d > 0.5;
  }

  public Optional<Double> getDistanceWithOptional(Double d)
  {
    if (!isMeetingRequirement(d))
    {
      return Optional.empty();
    }
    else return Optional.of(Math.abs(d - THRESHHOLD));
  }
  
  public Optional<Double> getDistanceWithException(Double d)
  {
    if (!isMeetingRequirement(d))
    {
      throw new IllegalArgumentException("Requirement not met.");
    }
    else return Optional.of(Math.abs(d - THRESHHOLD));
  }
}
