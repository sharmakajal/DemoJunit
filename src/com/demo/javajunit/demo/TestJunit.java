package com.demo.javajunit.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test
   public void testSetup() {
      String str= "Junit-setup";
      assertEquals("Junit setup",str);
   }
}
