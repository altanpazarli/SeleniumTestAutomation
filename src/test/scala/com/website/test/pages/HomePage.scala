package com.website.test.pages

import com.website.test.Configuration
import com.website.test.utilities.WebDrivers.webDriver
import org.openqa.selenium._

object HomePage {

  val homePageUrl = Configuration.baseUrl

  val firstName = Configuration.firstName

  def countrySelectorCloseButton = webDriver.findElement(By.cssSelector(".gl-modal__close"))

  def loginLinkOnHomePage = webDriver.findElement(By.cssSelector("a[manual_cm_sp='customer_info-_-Log in']"))

}
