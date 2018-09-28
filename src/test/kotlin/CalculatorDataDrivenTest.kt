package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.*

class CalculatorDataDrivenTest : StringSpec({

    "addition" {  
        table(
            headers("a", "b", "sum"),
            row(5.0, 2.0, 7.0),
            row(-4.0, 3.5, -0.5)
        ).forAll { a, b, sum ->
            add(a, b) shouldBe exactly(sum)
        }
    }
}) 
