/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terracotta.angela.common.tcconfig;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Ludovic Orban
 */
public final class ServerSymbolicName implements Serializable {
  private static final long serialVersionUID = 1L;

  private final String symbolicName;

  public ServerSymbolicName(String symbolicName) {
    Objects.requireNonNull(symbolicName, "symbolicName cannot be null");
    this.symbolicName = symbolicName;
  }

  public static ServerSymbolicName symbolicName(String name) {
    return new ServerSymbolicName(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ServerSymbolicName that = (ServerSymbolicName) o;

    return symbolicName.equals(that.symbolicName);
  }

  @Override
  public int hashCode() {
    return symbolicName.hashCode();
  }

  public String getSymbolicName() {
    return symbolicName;
  }

  @Override
  public String toString() {
    return "ServerSymbolicName{" + symbolicName + '}';
  }
}
