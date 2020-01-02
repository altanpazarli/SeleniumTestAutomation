package com.website.test.utilities

import java.io.File
import com.website.test.Configuration
import org.openqa.selenium.chrome.ChromeDriver

object WebDrivers {
  System.setProperty("webdriver.chrome.driver", new File(Configuration.chromeDriver).getAbsolutePath)
  implicit val webDriver : ChromeDriver = new ChromeDriver()
}
