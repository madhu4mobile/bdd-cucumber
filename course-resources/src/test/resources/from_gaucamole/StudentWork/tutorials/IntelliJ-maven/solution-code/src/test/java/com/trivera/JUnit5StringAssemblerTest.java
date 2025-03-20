package com.trivera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit5StringAssemblerTest {
   private StringAssembler assembler;

   @BeforeEach
   void setup(){
      this.assembler = new StringAssembler();
   }

   @Test
   void test() {

      assembler.add("12345678901234567890123456789012345678901");
      String result = assembler.toString();

      assertEquals("1234567890123456789012345678901234567890", result);
   }
   @Test
   void test1() {

      assembler.add("1234567890123456789012345678901234567890");
      String result = assembler.toString();

      assertEquals("1234567890123456789012345678901234567890", result);
   }

   @Test
   void test2() {

      assembler.add("12345678901234567890123456789");
      String result = assembler.toString();

      assertEquals("12345678901234567890123456789...........", result);
      assertEquals(40, result.length());
   }

   @Test
   void test3() {

      assembler.add("12345678901234567890123456789");
      assembler.add("12345678901234567890123456789");
      String result = assembler.toString();

      assertEquals("12345678901234567890123456789...........;12345678901234567890123456789...........", result);
      assertEquals(81, result.length());
   }

   @Test
   void test4() {

      assembler.add("A");
      assembler.add("B");
      assembler.add("C");
      assembler.add("D");
      String result = assembler.toString();

      assertEquals(163, result.length());
   }

   @Test
   void testNull() {
      assembler.add(null);
      assembler.add("A");

      String result = assembler.toString();

      assertEquals(40, result.length());
      assertEquals('A', result.charAt(0));
   }

   @Test
   void test5() {

      assembler.add("ABC;DEF");
      assembler.add("GHI;JKL;MNO");

      String result = assembler.toString();

      assertEquals("ABC#DEF.................................;GHI#JKL#MNO.............................", result);
   }
}