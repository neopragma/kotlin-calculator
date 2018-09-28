package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class CalculatorFunSpecTest : FunSpec() {
    init {
        testAdd()
        testSubtract()
        testDivide()
        testMultiply()
    }

    fun testAdd() = test("add returns the correct result") {
        add(2.0, 4.0) shouldBe exactly(6.0)
    }

    fun testSubtract() = test("subtract returns the correct result") {
        subtract(4.0, 2.0) shouldBe exactly(2.0)
    }

    fun testDivide() = test("divide returns the correct result") {
        divide(10.0, 2.0) shouldBe exactly(5.0)
    }

    fun testMultiply() = test("multiply returns the correct result") {
        multiply(6.2, 4.5) shouldBe exactly(27.9)
    }
}