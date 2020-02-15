package com.demo

case class PolishCalc(data: List[Double] = Nil) {
  def push(number: Double): PolishCalc = PolishCalc(data = number :: data)

  def add: PolishCalc = data match {
    case i :: j :: rest => PolishCalc(i + j :: rest)
  }

}
