package com.example.Exercise1.Service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.*;

@Service
public class ClarivateDataScrappingService {

    public Map<String, List<String>> ScrapData() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.clarivate.com");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-close-btn-container"))).click();
            WebElement productServicesDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"nav-link\"])[5]")));
            productServicesDropdown.click();

            List<WebElement> subCategoryColumns = driver.findElements(By.className("subnav-col"));

            Map<String, List<String>> productServicesMap = new LinkedHashMap<>();

            for (WebElement subCategoryColumn : subCategoryColumns) {
                WebElement categoryElement = subCategoryColumn.findElement(By.cssSelector(".product-category-title a"));
                String categoryName = categoryElement.getText();

                List<WebElement> subcategoryElements = subCategoryColumn.findElements(By.cssSelector(".product-category-subtitle a"));
                List<String> subcategoryList = subcategoryElements.stream().map(WebElement::getText).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

                productServicesMap.put(categoryName, subcategoryList);
            }

            printStructuredOutput(productServicesMap);

            driver.quit();

            return productServicesMap;

        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
            return null;
        }
    }

    private void printStructuredOutput(Map<String, List<String>> productServicesMap) {
        productServicesMap.forEach((category, subcategories) -> {
            System.out.println(category);
            subcategories.forEach(subcategory -> System.out.println("\t" + subcategory));
        });
    }
}
