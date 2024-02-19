package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class CustomTest {

    @Test
    @DisplayName("DisplayName은 주제별로 나누기 좋다")
    void test1(){
        System.out.println("테스트1입니다.");
    }

    @Nested
    @DisplayName("Order을 사용해서 test의 순서를 조절할 수 있다.")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Test1 {

        @Order(1)
        @Test
        @DisplayName("Test1 클래스")
        void test() {
            System.out.println("\nTest1 클래스");
        }

        @Order(3)
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Order(2)
        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @Nested
    @DisplayName("Nested는 계층별로 나누기 좋다.")
    class Test2 {
        @Test
        @DisplayName("Test2 - test1()")
        void test1() {
            System.out.println("Test2.test1");
        }

        @Test
        @DisplayName("Test2 - test2()")
        void test2() {
            System.out.println("Test2.test2");
        }
    }
}

