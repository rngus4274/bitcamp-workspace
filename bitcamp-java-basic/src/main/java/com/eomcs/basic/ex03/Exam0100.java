package com.eomcs.basic.ex03;

//# 리터럴(literal)
//- 자바 언어로 표현한 값.
//

public class Exam0100 {
  public static void main(String[] args) {
    // 출력 명령문
    // - System.out.println(값);

    // [숫자]
    // 정수
    System.out.println(78);
    System.out.println(+78);
    System.out.println(-78);
    System.out.println(0116); // 0으로 시작하면 8진수
    System.out.println(0x4e); // 0x42 0x로 시작하면 16진수
    System.out.println(0b01001110); // 0b01001110 0b로 시작하면 2진수

    // 부동소수점(실수)
    System.out.println(3.14);
    System.out.println(31.4e-1);
    System.out.println(314e-2);
    System.out.println(0.0314e2);

    // [논리]
    // - 참/거짓
    System.out.println(true);
    System.out.println(false);

    // [문자]
    // 문자
    System.out.println('A');
    System.out.println('가');

    // 문자열
    System.out.println("A");
    System.out.println("가");
    System.out.println("");
    System.out.println("ABC");
    System.out.println("가나다");
  }
}