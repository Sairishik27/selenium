package maven;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newww {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
String[] names= {"Cucumber","Brocolli","Beans"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products=  driver.findElements(By.cssSelector("h4[class='product-name']"));
		Thread.sleep(3000);
		int j=0;
		for(int i=0;i<products.size();i++) 
		{
		String[] name=products.get(i).getText().split("-");
		
		String formattedName=name[0].trim();
		List itemsNeededList=Arrays.asList(names);
		if(itemsNeededList.contains(formattedName))
		{ 
		j++;	
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	    if(j==names.length) {
	    	break;
	    }
			
			
		}
		
		}
		
		
		
				
	

	}

}
