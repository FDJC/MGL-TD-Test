package romannumberconverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {




  RomanNumberConverter romanNumberConv;

  @Before
  public void setup() {
    romanNumberConv = new RomanNumberConverter();
  }

  @Test
  public void check_X_int() {
    assertThat(romanNumberConv.convert(1))
      .isNotEmpty()
      .contains("I")
      .endsWith("I")
      .isEqualTo("I");
    assertThat(romanNumberConv.convert(5))
      .isNotEmpty()
      .contains("V")
      .endsWith("V")
      .isEqualTo("V");
    assertThat(romanNumberConv.convert(10))
      .isNotEmpty()
      .contains("X")
      .endsWith("X")
      .isEqualTo("X");
    assertThat(romanNumberConv.convert(50))
      .isNotEmpty()
      .contains("L")
      .endsWith("L")
      .isEqualTo("L");
    assertThat(romanNumberConv.convert(100))
      .isNotEmpty()
      .contains("C")
      .endsWith("C")
      .isEqualTo("C");
    assertThat(romanNumberConv.convert(500))
      .isNotEmpty()
      .contains("D")
      .endsWith("D")
      .isEqualTo("D");
    assertThat(romanNumberConv.convert(1000))
      .isNotEmpty()
      .contains("M")
      .endsWith("M")
      .isEqualTo("M");

  }

  @Test
  public void check_X_String() {
    assertThat(romanNumberConv.convert("I"))
      //.isNotEmpty()
      .isEqualTo(1);
    assertThat(romanNumberConv.convert("V"))
      //.isNotEmpty()
      .isEqualTo(5);
    assertThat(romanNumberConv.convert("X"))
      //.isNotEmpty()
      .isEqualTo(10);
    assertThat(romanNumberConv.convert("L"))
      //.isNotEmpty()
      .isEqualTo(50);
    assertThat(romanNumberConv.convert("C"))
      //.isNotEmpty()
      .isEqualTo(100);
    assertThat(romanNumberConv.convert("D"))
      //.isNotEmpty()
      .isEqualTo(500);
    assertThat(romanNumberConv.convert("M"))
      //.isNotEmpty()
      .isEqualTo(1000);
    assertThat(romanNumberConv.convert("CC"))
      //.isNotEmpty()
      .isEqualTo(200);
  }


}
