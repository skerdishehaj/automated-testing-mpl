package org.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    // test cases are methods of void type

    Calculator calculator;

    @BeforeEach
    public void init(){
        System.out.println("Executing method init");
        calculator=new Calculator();
    }
    @AfterEach
    public  void tearDown(){
        System.out.println("Executing tearDown");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Executing beforeAll method");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Executing afterAll method");
    }

    @Test
    public void sumTest() {
        System.out.println("Executing method sumTest");
        // Phase 1:Test Data are the set of data to test a method
        int td1 = 2, td2 = 3;
        // We should define the expected result
        int expectedResult = 5;

        // Second phase: Invoke the testing method with the given set of data and store the result in a actual result variable
        int actualResult = calculator.sum(td1, td2);

        // Phase 3: Compare if the results are true or not, If yes test pass , else fail
        // We use the Assertions class that contains static methods
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void sumTest1() {
        System.out.println("Executing msumTest1");
        int td1 = 0, td2 = 7;
        int expectedResult = 7;
        int actualResult = calculator.sum(td1, td2);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    @Disabled
    public void sumTest2() {
        System.out.println("Executing sumTest2");
        Calculator calculator = new Calculator();
        int td1 = 10, td2 = -20;
        int expectedResult = -10;
        int actualResult = calculator.sum(td1, td2);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void zbritjaTest(){
       int td3=4,  td4=3;
       int expectedResult= 1;
       int actualResult= calculator.zbritje(td3, td4);
       Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void divisionTest(){
        int td5=10, td6=5;
        int expectedResult = 2;
        double actualResult = calculator.division(td5,td6);
        Assertions.assertEquals(expectedResult,actualResult);

    }
}