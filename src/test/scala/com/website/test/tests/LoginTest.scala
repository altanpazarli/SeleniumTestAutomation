package com.website.test.tests

import com.website.test.pages.HomePage._
import com.website.test.pages.LoginPage._
import com.website.test.pages.MyAccountPage._
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.selenium.WebBrowser
import org.scalatest.concurrent.Eventually._
import org.scalatest.time.{Seconds, Span}
import com.website.test.utilities.WebDrivers._

class LoginTest extends FlatSpec with Matchers with WebBrowser {
  implicit val patienceConfig =
    PatienceConfig(timeout = scaled(Span(10, Seconds)), interval = scaled(Span(1, Seconds)))

  behavior of "Login function"

  it should "warn user if user logged in with wrong creds" in {

    go to homePageUrl
    currentUrl shouldBe homePageUrl
    click on countrySelectorCloseButton
    click on loginLinkOnHomePage
    currentUrl shouldBe loginPageUrl
    userNameSection.sendKeys(userName)
    passWordSection.sendKeys(wrongPassword)
    click on loginButton
    wrongPasswordWarning.isDisplayed shouldBe true
  }

  it should "logged in when user login with correct creds " in {

    go to homePageUrl
    currentUrl shouldBe homePageUrl
    click on loginLinkOnHomePage
    userNameSection.sendKeys(userName)
    passWordSection.sendKeys(password)
    clickOn(loginButton)
    currentUrl should startWith(myAccountPageUrl)
    welcomeMessage shouldBe "WELCOME BACK " + firstName

    close()
  }

}
