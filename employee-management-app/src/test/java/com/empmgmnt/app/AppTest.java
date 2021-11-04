package com.empmgmnt.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Supplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

/**
 * Unit test for simple App.
 */

@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {

//	MathOperation obj;
//
//	@BeforeAll
//	public void init() {
//		System.out.println("Unit Test Started..");
//	}
//
//	@AfterAll
//	public void complete() {
//		System.out.println("Unit Test Completed..");
//	}
//
//	@BeforeEach
//	public void beforeEachTest() {
//		obj = new MathOperation();
//		System.out.println("Test Begin..");
//	}
//
//	@AfterEach
//	public void afterEachTest() {
//		obj = null;
//
//		System.out.println("Test End..");
//	}
//
//	@Test
//	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
//	public void addTest() {
//
//		assertEquals(15, obj.add(5, 10), () -> {
//			System.err.println("Test Failed..");
//			return "Error";
//		});
//
//		System.out.println("Successful..");
//
//	}
//
//	@Nested
//	class DivideTest {
//		@Test
//		public void divideTest() {
//
//			assertEquals(1, obj.divide(5, 4));
//		}
//
//		@Test
//		@DisabledOnOs(value = OS.WINDOWS)
//		@DisabledIfEnvironmentVariable(named = "test1", matches = "false", disabledReason = "I am not interested")
//		public void divideTestForError() {
//
//			assertThrows(ArithmeticException.class, () -> {
//				obj.divide(5, 0);
//			});
//
//		}
//	}

}
