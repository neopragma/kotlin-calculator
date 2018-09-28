package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class CalculatorDescribeSpecTest : DescribeSpec({    

    describe("addition") {
        context("compute the sum of two numbers") {
            it("adding 2 and 4 results in 6") {
                add(2.0, 4.0) shouldBe exactly(6.0)
            }
            it("adding -5 and 3 results in -2") {
                add(-5.0, 3.0) shouldBe exactly(-2.0)
            }
        }
    }
}) 
