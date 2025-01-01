package utils;

import org.openqa.selenium.WebDriver;
import pageobject.PageObjectManager;

import java.io.IOException;

public class Testcontextsetup {
	public WebDriver driver;
	public String currentURL;
	public String currentpage;
	public TestBase testbase;
	public PageObjectManager pageobjectmanager;
	public GeneralUtils generalutils;
	public Testcontextsetup() throws IOException {
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
		generalutils=new GeneralUtils(testbase.WebDriverManager());
	}

}
