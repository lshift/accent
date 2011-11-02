/**
 * Copyright (C) 2011 LShift Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.lshift.accent;

import com.rabbitmq.client.Connection;

import java.io.IOException;

/**
 * Internal listener used to notify channels that a connection has been successfully established.
 */
public interface ConnectionListener {
  /**
   * Indicates that a connection has been created.
   * @param connection the created connection.
   */
  void onConnected(Connection connection) throws IOException;
}
