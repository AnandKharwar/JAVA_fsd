package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calc;
  
  @BeforeEach
  public void setup() {
	  calc=new Calculator();
	  System.out.println("Calculator Initiated !!");
  }
  @AfterEach
  public void tearDown() {
	  calc=null;
	  System.out.println("Calculator Closed !!");
  }
  
  @Test
  public void addtest() {
	  assertEquals(15,calc.add(10, 5));
  }
  
  @Test
  public void Subtest() {
	  assertNotEquals(15,calc.sub(10, 5));
	  assertEquals(5,calc.sub(10, 5));
  }
  @Test
  public void Multiplytest() {
	  assertEquals(50,calc.multiply(10, 5));
	  assertNotEquals(15,calc.multiply(10, 5));
  }
  @Test
  public void Devidetest() {
	  assertEquals(3,calc.divide(18, 6));
	  assertNotEquals(4,calc.divide(10, 5));
  }
}
