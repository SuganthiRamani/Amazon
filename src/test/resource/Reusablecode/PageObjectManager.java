package Reusablecode;

import org.openqa.selenium.WebDriver;

import com.cucumberautomationpractice.pom.Amazonhomepage;
import com.cucumberautomationpractice.pom.Amazonloginpage;

public class PageObjectManager {
	public WebDriver driver;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	private Amazonhomepage hp = null;
	private Amazonloginpage lp = null;

	public Amazonhomepage getHomePage() {
		if (hp == null) {
			hp = new Amazonhomepage(driver);
		}
		return hp;

	}

	public Amazonloginpage getLoginPage() {
		if (lp == null) {
			lp = new  Amazonloginpage(driver);
		}

		return lp;

	}

}
