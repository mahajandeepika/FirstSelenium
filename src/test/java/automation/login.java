package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) {

        String baseUrl = "https://in.linkedin.com/";
        System.setProperty("webdriver.chrome.driver","E:\\swdtools\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println("URL Entered");
        driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
        driver.findElement(By.id("username")).sendKeys("mahajandp6@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Deepika");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
