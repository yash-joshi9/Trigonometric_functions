package MathFunctions;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCase_version_1.class,
	TestCase_version_2.class,
	TestCase_version_3.class,
	TestCase_version_4.class
})

//Checks all the test cases with single file (TestSuite)
public class AllTests {
}
