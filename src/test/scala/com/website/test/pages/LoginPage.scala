package com.website.test.pages

import com.website.test.Configuration
import com.website.test.utilities.WebDrivers.webDriver
import org.openqa.selenium._

import scala.util.Random

object LoginPage {

  val loginPageUrl = Configuration.loginPageUrl

  def userNameSection = webDriver.findElement(By.cssSelector("input[id='dwfrm_login_username']"))

  val userName = Configuration.username

  def passWordSection = webDriver.findElement(By.cssSelector("input[id='dwfrm_login_password']"))

  val wrongPassword = Random.alphanumeric.take(8).mkString

  def wrongPasswordWarning = webDriver.findElement(By.cssSelector("#login-warning-alert"))

  val password = Configuration.password

  def loginButton = webDriver.findElement(By.cssSelector("button[name='dwfrm_login_login']"))

}
