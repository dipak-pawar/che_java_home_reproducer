package org.dipak;

import org.junit.Assert;
import org.junit.Test;

public class JavaHomeReproducerTest {

   @Test
   public void java_home_should_not_be_null() {
      final String javaHome = System.getenv("JAVA_HOME");

      Assert.assertNotNull(javaHome);

   }
}
