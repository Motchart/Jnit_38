package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out
				.println("Before Class method will be executed before first test method starts");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out
				.println("After Class method will be executed before first test method completed");

	}

	@Before
	public  void beforeMethod() throws Exception {
		System.out
				.println("Before method will executed before every test method");

	}

	@After
	public  void afterMethod() throws Exception {
		System.out.println("After method will execute after every test method");

	}

	@Test
	// @Ignore
	public void test_01_AssertEquals_Positive() {
		System.out.println("Test_01_assertEquals_Positive");
	}

	@Test
	// @Ignore
	public void test_02_AssertEquals_Nagative() {
		System.out.println("Test_02_assertEquals_Negative");
	}

	@Test
	@Ignore
	public void test_03_AssertEquals_Ignore() {
		System.out.println("Test_03_assertEquals_Ignored");
	}

	@Test
	// @Ignore
	public void test_04_AssertEquals_Positive() {
		System.out.println("Test_04_assertEquals_Positive");
	}

	@Test
	// @Ignore
	public void test_05_AssertEquals_Negative() {
		System.out.println("Test_05_assertEquals_Negative");
	}

	@Test
	@Ignore
	public void test_06_AssertEquals_Ignore() {
		System.out.println("Test_06_assertEquals_Ignored");
	}

	@Test
	// @Ignore
	public void test_07_AssertEquals_Positive() {
		System.out.println("Test_07_assertEquals_Positive");
	}

	@Test
	// @Ignore
	public void test_08_AssertEquals_Negative() {
		System.out.println("Test_08_assertEquals_Negative");
	}

	@Test
	// @Ignore
	public void test_09_AssertEquals_Positive() {
		System.out.println("Test_09_assertEquals_Positive");
	}

	@Test
	// @Ignore
	public void test_10_AssertEquals_Negative() {
		System.out.println("Test_10_assertEquals_Negative");
	}
}
