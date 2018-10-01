package com.neopragma.calculator

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.*

import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorSpecStyleSpek: Spek({
    describe("A calculator") {
        context("addition") {
            it("returns 8.5 when adding 3.5 and 5.0") {
                assertEquals(8.5, add(3.5, 5.0))
            }
        }
        context("subtraction") {
            it("returns 4.25 when subtracting 9.25 from 13.5") {
                assertEquals(4.25, subtract(13.5, 9.25))
            }
        }
    }
})
