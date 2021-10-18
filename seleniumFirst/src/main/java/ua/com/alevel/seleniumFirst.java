package ua.com.alevel;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class seleniumFirst {

    @Test
    @Deprecated
    public void findElementByIdAndAbsoluteXpath() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            WebElement loginIcon = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/ul/li[3]/rz-user/button"));
            loginIcon.click();
            WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
            inputLogin.isDisplayed();
            inputLogin.sendKeys("nixsolutions");
            WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
            inputLogin.isDisplayed();
            inputPassword.sendKeys("password");
            WebElement closeIframe = driver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[1]/button"));
            closeIframe.click();
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementClassName() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            WebElement menuWrapper = driver.findElement(By.className("menu-categories_type_main"));
            List<WebElement> options = menuWrapper.findElements(By.tagName("li"));
            for (WebElement e : options) {
                System.out.println(e.getText());
            }
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementByTagName() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            var waiter = new WebDriverWait(driver, 60);
            WebElement checkAppropriateSlideIsDisplayed = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/rz-main-page/div/main/main-page-content/top-slider/app-slider/div/div/ul/li[7]")));
            var listElementsImage = driver.findElements(By.tagName("img"));
            System.out.println("tag img size = " + listElementsImage.size());
        } finally {
            driver.close();
        }
    }

    @Test
    public void findElementByName() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(1))
                    .ignoring(NoSuchElementException.class);
            WebElement slide = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/rz-main-page/div/main/main-page-content/top-slider/app-slider/div/div/ul/li[7]")));
                }
            });
            WebElement langHeader = driver.findElement(By.className("lang-header"));
            List<WebElement> langOptions = langHeader.findElements(By.tagName("li"));
            langOptions.stream().filter(s -> s.getText().contains("RU")).findAny().orElseThrow(RuntimeException::new);
        } finally {
            driver.close();
        }
    }


    @Test
    @Deprecated
    public void findElementLinkText() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            var waiter = new WebDriverWait(driver, 60);
            waiter.until(new ExpectedCondition<Boolean>() {
                @Override
                public @Nullable Boolean apply(@Nullable WebDriver driver) {
                    return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/main/main-page-content/top-slider/app-slider/div/div/ul/li[2]")).isDisplayed();
                }
            });
            WebElement gunDiscount = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText("УМБ Xiaomi Redmi Power Bank 20000mAh 2xUSB QC3.0 18W PB200LZM Black (VXN4304GL)")));
            gunDiscount.click();
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementPartLinkText() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            var waiter = new WebDriverWait(driver, 60).withMessage("Banner was not found");
            waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rz-banner-img\"]")));
            WebElement remedy = driver.findElement(By.partialLinkText("Средство"));
            remedy.isDisplayed();
            System.out.println(remedy.getText());
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementByRelativeCssPath() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/rz-main-page/div/main/main-page-content/top-slider/app-slider/div/div/ul/li[3]")));
            WebElement header = driver.findElement(By.cssSelector("body > app-root > div > div > rz-header > header > div"));
            header.isDisplayed();
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementByIdCssPath() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rz-banner-img\"]")));
            WebElement header = driver.findElement(By.cssSelector("#fat-menu"));
            header.click();
            WebElement menu = driver.findElement(By.className("menu__hidden-content"));
            menu.isDisplayed();
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementByCssPath() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            new WebDriverWait(driver, 10).until(ExpectedConditions.urlMatches("https://rozetka.com.ua/"));
            WebElement inputField = driver.findElement(By.cssSelector("div input"));
            inputField.click();
            inputField.sendKeys("nixsolutions");
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementByDiffCssPath() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body app-root div div rz-header")));
            WebElement inputField = driver.findElement(By.cssSelector("input.search-form__input"));
            inputField.click();
            inputField.sendKeys("nixsolutions");
            new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementValue(inputField, "nixsolutions"));
            WebElement rozetkaLogo = driver.findElement(By.cssSelector("img[alt='Rozetka Logo']"));
            rozetkaLogo.isDisplayed();
        } finally {
            driver.close();
        }
    }

    @Test
    @Deprecated
    public void findElementXpathWithAttributes() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
            driver.get("https://rozetka.com.ua/");
            WebElement iconMenu = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/rz-mobile-user-menu/button"));
            iconMenu.click();
            WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/nav/div/div[2]/div/div[2]/div/button[1]"));
            enterButton.click();
            WebElement loginDialog = driver.findElement(By.xpath("//*[contains(@class, 'modal__heading') and text() = ' Вход ']"));
            loginDialog.isDisplayed();
        } finally {
            driver.close();
        }
    }
}



