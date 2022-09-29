package com.springboot.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDummy {
  public List<Integer> generate(final int money) {
    if(!isValidMoney(money)) {
      throw new RuntimeException("아닙니다.");
    }
    return generate();
  }

  private boolean isValidMoney(final int money) {
    return money == 1000;
  }

  private List<Integer> generate() {
    return new Random()
        .ints(1, 45 + 1)
        .distinct()
        .limit(6)
        .boxed()
        .collect(Collectors.toList());
  }
  
  @DisplayName("갯수 테스트")
  @Test
  void sizeTest() {
    // given
    final TestDummy dumy = new TestDummy();
    final int price = 1000;
    
    // when
    final List<Integer> number = dumy.generate(price);
    
    // then
    assertThat(number.size()).isEqualTo(6);
  }
  
  @DisplayName("출력 메세지 테스트")
  @Test
  void outputMsgTest() {
    // given
    final TestDummy dumy = new TestDummy();
    final int price = 2000;
    
    // when
    final RuntimeException exception = assertThrows(RuntimeException.class, () -> dumy.generate(price));
    
    // then
    assertThat(exception.getMessage()).isEqualTo("올바른 금액이 아닙니다.");
  }

  
  @DisplayName("범위 테스트")
  @Test
  void rangeTest() {
    // given
    final TestDummy dumy = new TestDummy();
    final int price = 1000;
    
    // when
    final List<Integer> number = dumy.generate(price);
    
    // then
    assertThat(number.stream().allMatch(v -> v >= 1 && v <= 45)).isTrue();
  }

}
