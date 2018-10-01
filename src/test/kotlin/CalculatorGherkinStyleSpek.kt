package com.neopragma.calculator

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.*

import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorGherkinStyleSpek: Spek({
    Feature("Calculator") {
        Scenario("Addition") {        
            Given("we add 3.5 and 5.0") { }
            When("we run the calculator") { }
            Then("the result is 8.5") {
                assertEquals(8.5, add(3.5, 5.0), 0.05)
            }
        }
        Scenario("Subtraction") {        
            Given("we subtract 9.25 from 13.5") { }
            When("we run the calculator") { }
            Then("the result is 4.25") {
                assertEquals(4.25, subtract(13.5, 9.25), 0.05)
            }
        }
    }
})
