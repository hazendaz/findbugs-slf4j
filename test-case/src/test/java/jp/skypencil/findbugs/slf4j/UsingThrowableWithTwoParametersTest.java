package jp.skypencil.findbugs.slf4j;

import java.util.Collections;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class UsingThrowableWithTwoParametersTest {
  @Test
  public void test() {
    Map<String, Integer> expected = Collections.emptyMap();
    new XmlParser().expect(pkg.UsingThrowableWithTwoParameters.class, expected);
  }
}
