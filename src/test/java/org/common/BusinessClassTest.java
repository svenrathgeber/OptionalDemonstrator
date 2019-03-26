package org.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BusinessClassTest {
  
  @Test
  public void basicTest()
  {
    assertTrue(BusinessClass.isMeetingRequirement(1.0));
  }
}
