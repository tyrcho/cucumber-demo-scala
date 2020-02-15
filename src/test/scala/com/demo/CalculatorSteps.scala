package com.demo

import cucumber.api.scala.{EN, ScalaDsl}
import io.cucumber.datatable.DataTable
import org.scalatest.matchers.must.Matchers
import scala.collection.JavaConverters._

class CalculatorSteps extends ScalaDsl with EN with Matchers {
  var calc: PolishCalc = PolishCalc()
  Given("a reset calculator") { () =>
    calc = PolishCalc()
  }

  Given("the previous entries:") { table: DataTable =>
    calc = table.asMaps().asScala.foldLeft(calc) {
      case (calc, map) =>
        calc
          .push(map.asScala("first").toDouble)
          .push(map.asScala("second").toDouble)
          .add
    }
  }

  When("I press (.*)") { what: Double =>
    calc = calc.push(what)
  }

  When("I add") { () =>
    calc = calc.add
  }

  Then("I get (.*)") { result: Double =>
    calc.data.head mustBe result +- 0.001
  }
}
