package com.terracottatech.qa.angela.common.topology;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TmsConfig {

  private final String hostname;
  private final int tmsPort;

  public TmsConfig(String hostname, int tmsPort) {
    this.hostname = hostname;
    this.tmsPort = tmsPort;
  }

  public String getHostname() {
    return hostname;
  }

  public String getIp() throws UnknownHostException {
    InetAddress address = InetAddress.getByName(hostname);
    return address.getHostAddress();
  }

  public int getTmsPort() {
    return tmsPort;
  }

  public static TmsConfig noTms() {
    return null;
  }

  public static TmsConfig withTms(String hostname, int tmsPort) {
    return new TmsConfig(hostname, tmsPort);
  }

  public static TmsConfig hostnameAndPort(String hostname, int tmsPort) {
    return new TmsConfig(hostname, tmsPort);
  }
}