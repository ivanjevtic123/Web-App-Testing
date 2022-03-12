package ts_dz1_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class PermutovanoPrijavljivanje {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\korisnik\\Desktop\\TS_dz1_web\\jarFolder\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			WebDriver web = new ChromeDriver(options);
			web.get("http://localhost/projekat4/ankete2/login.php");
			web.manage().window().maximize();
			
			WebElement user = web.findElement(By.name("username1"));
			user.sendKeys("Sifra1234$");
			
			Thread.sleep(2100);
			
			WebElement pass = web.findElement(By.name("password1"));
			pass.sendKeys("Luka1996");
			
			WebElement btn1 = web.findElement(By.name("logindugme"));
			btn1.click();
			//System.out.println("proba");
			//validation point
			WebElement provera = web.findElement(By.linkText("LOGUOT"));//Login
			System.out.println("TestNeuspesan - korisnik se ulogovao");
			
			Thread.sleep(2100);
			web.close();
		} catch (Exception e) {
			//System.err.println(e.getMessage());
			System.out.println("Test uspesan - korisnik nije uspeo da se uloguje");
		}
	}
}
