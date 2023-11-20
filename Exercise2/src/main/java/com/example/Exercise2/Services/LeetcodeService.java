package com.example.Exercise2.Services;

import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

@Service
public class LeetcodeService {


    public String codePasting(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
//            driver.get("https://leetcode.com/");
//
//            WebElement languageSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Java']")));
//            js.executeScript("arguments[0].scrollIntoView();", languageSelect);
//            languageSelect.click();

            driver.get("https://leetcode.com/playground/new/empty");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("langMenu"))).click();

            WebElement language = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//div[@class='language-dropdown-menu-item' and contains(text(),'Java')]"));
            language.click();

            WebElement codeEditor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"CodeMirror-lines\"]//div")));
            wait.until(ExpectedConditions.visibilityOf(codeEditor));

            Actions actions = new Actions(driver);
            actions.moveToElement(codeEditor).click().build().perform();
            actions
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .sendKeys(Keys.DELETE)
                    .build()
                    .perform();

            String classContent = loadClassContent();

//            js.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", codeEditor, classContent);
            actions.sendKeys(classContent).build().perform();

            WebElement runButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"btn btn-success round run-code-btn\"]")));
            runButton.click();

            WebElement successResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"success result\"]")));
            String success = successResult.getText();

            WebElement outputResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"output\"]")));
            String output = outputResult.getText();

            Thread.sleep(1000);

            return (success + "<br>" + output.replace("\n", "<br>"));

        }catch (Exception e) {
            e.printStackTrace();
            return null;

        }finally {
            driver.quit();
        }
    }
    private String loadClassContent() {
        String filePath = "C:/Users/U6074533/IdeaProjects/Week4/Exercise2/src/main/java/com/example/Exercise2/ExerciseClasses/Pattern.java";
        try {
            Path path = Paths.get(filePath);
//            return new String(Files.readAllBytes(path)).replace("}", "");
//            return new String(Files.readString(path));
            List<String> lines = Files.readAllLines(path);
            String codeContent = String.join("",lines);

            return codeContent;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
