package com.demo

import cucumber.api.Scenario
import cucumber.api.scala.{EN, ScalaDsl}

class MySteps extends ScalaDsl with EN {
  Given("a calculator I just turned on") { () =>
    println("starting")
  }

  When("I press (.*)"){ what:Int =>
    println(s"pressed $what")
  }

  Before("not @foo") { scenario: Scenario =>
    scenario.write("hello scenario")
  }
}
