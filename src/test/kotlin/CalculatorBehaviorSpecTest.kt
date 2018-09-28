package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class CalculatorBehaviorSpecTest : BehaviorSpec({    

    given("we want to determine the sum of two numbers") {
        `when`("we add two and four") {
            then("the result is six") {
                add(2.0, 4.0) shouldBe exactly(6.0)
            }
        }
    }

    Given("we want to determine the product of two numbers") {
        When("we multiply five and nine") {
            Then("the result is forty-five") {
                multiply(5.0, 9.0) shouldBe exactly(45.0)
            }
        }
    }
}) 
