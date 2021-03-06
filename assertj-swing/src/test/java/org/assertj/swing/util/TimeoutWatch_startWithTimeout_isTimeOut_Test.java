/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.swing.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Tests for {@link TimeoutWatch#startWatchWithTimeoutOf(long)} and {@link TimeoutWatch#isTimeOut()}.
 * 
 * @author Alex Ruiz
 */
public class TimeoutWatch_startWithTimeout_isTimeOut_Test {
  @Test
  public void should_Not_Timeout() {
    TimeoutWatch watch = TimeoutWatch.startWatchWithTimeoutOf(5000);
    assertThat(watch.isTimeOut()).isFalse();
  }

  @Test
  public void should_Timeout() throws Exception {
    TimeoutWatch watch = TimeoutWatch.startWatchWithTimeoutOf(10);
    Thread.sleep(100);
    assertThat(watch.isTimeOut()).isTrue();
  }
}
