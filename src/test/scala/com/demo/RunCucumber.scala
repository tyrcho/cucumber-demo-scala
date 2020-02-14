package com.demo

object RunCucumber extends App {
  io.cucumber.core.cli.Main.main("--strict", "--plugin", "pretty", "src/test/resources")
}
