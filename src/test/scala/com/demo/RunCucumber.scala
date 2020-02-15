package com.demo

import io.cucumber.core.cli.Main

object RunCucumber extends App {
  Main.main(
    Array(
      "--strict",
      "-g",
      "com.demo",
      "--plugin",
      "pretty",
      "--plugin",
      "html:target/cucumber",
      "src/test/resources",
    ))
}
