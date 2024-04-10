package org.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratorTest {
  @Test
  public void test_Generate() {
    int expectedRange = 20;
    int actualNumber = Generator.generate(20);
    org.assertj.core.api.Assertions.assertThat(actualNumber).isBetween(-expectedRange, expectedRange);
  }
}
