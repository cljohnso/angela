package com.terracottatech.qa.angela.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Versions {

  public static final String TERRACOTTA_VERSION;
  public static final String TERRACOTTA_VERSION_4X = "4.3.5.0.34";

  static {
    try {
      Properties versionsProps = new Properties();
      try (InputStream in = Versions.class.getResourceAsStream("versions.properties")) {
        versionsProps.load(in);
      }
      TERRACOTTA_VERSION = versionsProps.getProperty("terracotta.version");
    } catch (IOException ioe) {
      throw new RuntimeException("Cannot find versions.properties in classpath");
    }
  }

}