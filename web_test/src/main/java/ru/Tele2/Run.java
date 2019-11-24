package ru.Tele2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;
import ru.Tele2.Settings;



public class Run extends Settings {

        @Test
        public void SearchPage() throws InterruptedException {

            String tariffSetUpButtonColection = "//div[contains(@class,'settings-link')]";
            String priceForTarriff = "//div[contains(@class,'hidden-xs')]//span[contains(@class,'price')]";
            String servicesCollection = "//div[contains(@class,'iconed-services-group')]//div[contains(@class,'item')]/img";
            String closeTip = "//div[contains(@class,'PushTip-close')]";
            //pages.SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

            driver.manage().window().maximize();
            driver.findElements(By.xpath(tariffSetUpButtonColection)).get(1).click();
            Thread.sleep(5000);

            //Проверка URL страницы на соответствие
            Assert.assertTrue(driver.getCurrentUrl().equals("https://msk.tele2.ru/nastroy-tariff#sliders"));
            Thread.sleep(5000);

            //Проверка цены тарифа на соответствие
            Assert.assertTrue(driver.findElement(By.xpath(priceForTarriff)).getText().equals("400"));
            Thread.sleep(3000);

            //Закрываем высплывающее окно на странице
            driver.switchTo().frame("fl-241715").findElement(By.xpath(closeTip)).click();
            Thread.sleep(3000);

            driver.switchTo().parentFrame();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(0,550)");

            driver.findElements(By.xpath(servicesCollection)).get(7).click();
            Thread.sleep(2000);


            Assert.assertTrue(driver.findElement(By.xpath(priceForTarriff)).getText().equals("550"));



        }
    }

