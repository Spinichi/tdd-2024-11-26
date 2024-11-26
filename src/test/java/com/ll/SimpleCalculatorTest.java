package com.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test // 단위 테스트 가능
    @DisplayName("계산기는 덧셈이 가능해야 한다.")
    public void t1() { // 뻔뻔하게 기능이 구현 된것처럼 요구사항을 적는다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1,2);

        Assertions.assertEquals(3,rs);
    } // 테스트 끝 -> 구현 시작? 구현을 하지 말고 테스트가 통과하게끔만 하면 됨
}
