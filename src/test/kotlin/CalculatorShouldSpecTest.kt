package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class CalculatorShouldSpecTest : ShouldSpec() {
    init {
        testAdd()
        testSubtract()
        testDivide()
        testMultiply()
    }

    fun testAdd() = should("add returns the correct result") {
        add(2.0, 4.0) shouldBe exactly(6.0)
    }

    fun testSubtract() = should("subtract returns the correct result") {
        subtract(4.0, 2.0) shouldBe exactly(2.0)
    }

    fun testDivide() = should("divide returns the correct result") {
        divide(10.0, 2.0) shouldBe exactly(5.0)
    }

    fun testMultiply() = should("multiply returns the correct result") {
        multiply(6.2, 4.5) shouldBe exactly(27.9)
    }
}