package org.example

plugins {
  id("com.gradle.enterprise")
}

gradleEnterprise {
  buildScan {
    publishAlways()
  }
}
