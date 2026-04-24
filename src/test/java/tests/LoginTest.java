package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage lp = new LoginPage(driver);
        lp.login("test", "1234");
    }
}
