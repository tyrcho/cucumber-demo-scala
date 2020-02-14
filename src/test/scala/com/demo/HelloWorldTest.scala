package com.demo

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldTest extends FlatSpec  with Matchers {
  "greeter" should "greet" in {
    val result = HelloWorld.greet("world")
    result shouldBe "Hello, world !"
  }
}
