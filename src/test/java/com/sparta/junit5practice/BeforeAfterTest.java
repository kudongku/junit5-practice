package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {
    // 테스트 코드가 실행 되기 전 메소드
    @BeforeEach
    void setUp() {
        System.out.println("테스트 코드가 실행 되기 전 수행");
    }

    // 테스트 코드가 실행 된 후 메소드
    @AfterEach
    void tearDown() {
        System.out.println("테스트 코드가 실행 된 후 수행");
    }

    // 모든 테스트 코드가 실행 되기 전 최초로 수행
    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행 되기 전 최초로 수행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 실행 된 후 최후로 수행");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }
}
