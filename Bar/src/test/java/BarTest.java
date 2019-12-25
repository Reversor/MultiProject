import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BarTest {

  @Test
  void bar() {
    Bar bar = new Bar();
    assertEquals("bar", bar.bar());
  }
}