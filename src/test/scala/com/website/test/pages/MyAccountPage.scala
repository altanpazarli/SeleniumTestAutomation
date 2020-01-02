package com.website.test.pages

import com.website.test.Configuration
import com.website.test.utilities.WebDrivers.webDriver
import org.openqa.selenium._

object MyAccountPage {

  val myAccountPageUrl = Configuration.myAccountPageUrl

  def welcomeMessage = webDriver.findElement(By.cssSelector("a[manual_cm_sp='header-_-customerinfo-_-username']")).getText

}
