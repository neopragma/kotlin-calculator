package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class CalculatorWordSpecTest : WordSpec({    
    "addition" should {
        "return the sum of two numbers" {
            add(2.0, 4.0) shouldBe exactly(6.0)
        }
    }
    "subtraction" should {
        "return the difference between two numbers" {
            subtract(4.0, 2.0) shouldBe exactly(2.0)
        }
    }
    "division" should {
        "return the quotient when a dividend is divided by a divisor" {
            divide(10.0, 2.0) shouldBe exactly(5.0)
        }
    }
    "multiplication" should {
        "return the product of two numbers" {
            multiply(6.2, 4.5) shouldBe exactly(27.9)
        }
    }
}) 
