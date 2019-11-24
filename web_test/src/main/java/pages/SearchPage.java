package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.Tele2.Settings;

/**
     * PageObject для Chrome
     */


    public class SearchPage extends Settings {


    public WebElement searchButton = driver.findElement(By.xpath("//span[contains(@class,'hidden-xs hidden-sm')]"));

    public WebElement inputSearch = driver.findElement(By.xpath("//input[@id='search-text']"));

    public WebElement inputText =driver.findElement(By.xpath( "//input[@id='search-text']"));

    public WebElement clickText = driver.findElement(By.xpath("//a[contains(@id,'tariffLink-')]"));
    }

