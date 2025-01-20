
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingsetup {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
try {
        // Open Google
        driver.get("https://www.flipkart.com/");
         WebElement s1= driver.findElement(By.xpath("//A[@title='Login']"));
         String actualText = s1.getText();
         String expectedText = "Login";
         
        // Print the title
        System.out.println("Page title is : " + driver.getTitle());
        if(actualText.equals(expectedText)) {
        	System.out.println("Login code present nosdft");
        	
        }
        else {
        	System.out.println("Not present Login---Test123xcc");
        }
    }
catch(Exception e) {
	System.out.println("error message is "+ e.getMessage());
	
}
finally{
	 // Close the browser
    driver.quit();	
}
       
    }
}
