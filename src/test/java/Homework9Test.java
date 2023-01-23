import homework9.Homework9;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Homework9Test {

    private static final String HOME_PAGE_URL = "https://www.facebook.com/";

    private static WebDriver driver;

    @BeforeAll
    public static void classSetup() {
        driver = Homework9.getWebDriver();
        driver.get(HOME_PAGE_URL);

    }

    @AfterAll
    public static void classTearDown() {
        Homework9.closeDriver();
    }

    @AfterEach
    public void testTearDown() {
        driver.get(HOME_PAGE_URL);

    }

    @Test
    public void findElementByXpathTest() throws InterruptedException {
        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        assertNotNull(createNewAccount);
        createNewAccount.click();
        Thread.sleep(1000);

        WebElement SignUPButton = driver.findElement(By.xpath("//a[@title='Sign Up for Facebook']"));
        assertNotNull(SignUPButton);

    }

    @ParameterizedTest
    @CsvSource({"fwefwewaggfwefawfwaf@gmail.com, 12341235", "@#%#%#%@gmail.com, 352525321", "annonimous@gmail.com, 8792432", "12345@gmail.com, *(^%&^%"})
    public void loginTest(String a, String b) throws InterruptedException {
        WebElement emailElement = driver.findElement(By.xpath("//input[@name='email']"));
        assertNotNull(emailElement);
        emailElement.sendKeys(a);


        WebElement passwordElement = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
        assertNotNull(passwordElement);
        passwordElement.sendKeys(b);


//        WebElement loginButtonElement = driver.findElement(By.xpath("//button[@type='submit']"));
//        assertNotNull(loginButtonElement);
//        loginButtonElement.click();
//        Thread.sleep(1000);

        String actualURL = driver.getCurrentUrl();
        assertEquals(HOME_PAGE_URL, actualURL, "URLs do not match");
    }
}
