package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    Login login;

    @BeforeClass
    public void setUp(){
        login = new Login();
    }

    @Test
    public void testIsLogin(){
        boolean actual = login.isLogin("admin","p4ssw0rd");
        Assert.assertTrue(actual);
    }

    @Test
    public void testMessageLoginSuccessful(){
        String expected = "Berhasil login";
        String actual = login.messageLogin(login.isLogin("admin","p4ssw0rd"));
        Assert.assertTrue(actual.equals(expected));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMessageLoginInvalid(){
        String expected = "Invalid login";
        String actual = login.messageLogin(login.isLogin("adminn","p4ssw0rd"));
        // Assert.assertTrue(actual.equals(expected));
        Assert.assertEquals(actual,expected);
    }

}
