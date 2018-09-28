package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.FeatureSpec

class CalculatorFeatureSpecTest : FeatureSpec({    

    feature("addition") {
        scenario("two plus four equals six") {
            add(2.0, 4.0) shouldBe exactly(6.0)
        }
        scenario("eight plus seven equals fifteen") {
            add(8.0, 7.0) shouldBe exactly(15.0)
        }
    }

    feature("multiplication") {
        scenario("two times four equals eight") {
            multiply(2.0, 4.0) shouldBe exactly(8.0)
        }
        scenario("eight plus seven equals fifteen") {
            multiply(20.0, 0.5) shouldBe exactly(10.0)
        }
    }
}) 
