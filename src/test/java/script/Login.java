 //from day35
package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Login extends BaseTest {

	@Test
	public void test1() {
		String title = driver.getTitle();
		Reporter.log(title,true);
	}
}
