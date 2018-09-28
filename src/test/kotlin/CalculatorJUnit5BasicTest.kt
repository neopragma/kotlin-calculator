package com.neopragma.calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorJUnit5BasicTest {

    @Test
    fun `adding 2 and 3 results in 5`() {
        assertEquals(5.0, add(2.0, 3.0))
    }
}