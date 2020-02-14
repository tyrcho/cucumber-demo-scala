package com.demo

import io.cucumber.java8.{En, Scenario}

class MySteps extends En {
  Given("^I press (.+)$", (what: String) => println(s"pressed $what"))

  Given("^a calculator I just turned on$", () => println("starting"))

  Before("not @foo", (scenario: Scenario) => {
   scenario.write("hello scenario")
  })
}
