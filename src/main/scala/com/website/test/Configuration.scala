package com.website.test

import com.typesafe.config.ConfigFactory

object Configuration {

  val config = ConfigFactory.load()

  val chromeDriver = config.getString("chrome.driver")

  val baseUrl = config.getString("baseUrl")

  val loginPageUrl = config.getString("baseUrl") + config.getString("loginPath")

  val myAccountPageUrl = config.getString("baseUrl") + config.getString("myAccountPath")

  val username = config.getString("creds.email")

  val password = config.getString("creds.pw")

  val firstName = config.getString("creds.firstName")

}
