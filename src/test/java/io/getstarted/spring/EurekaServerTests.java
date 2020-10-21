package io.getstarted.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

/**
 * Tests for {@link EurekaServer}.
 *
 * @author Andy Lian
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EurekaServerTests {

  @Test
  void start() {}
}
