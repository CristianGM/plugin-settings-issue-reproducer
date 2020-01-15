plugins {
  `kotlin-dsl`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  gradlePluginPortal()
  jcenter()
}

dependencies {
  implementation("com.gradle:gradle-enterprise-gradle-plugin:3.1.1")
}