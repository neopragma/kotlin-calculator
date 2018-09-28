package com.neopragma.calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Nested

class CalculatorJUnit5NestedTest {

    @Nested
    inner class CalculatorAdditionFunction {
    
        @Test
        fun `integer addition`() {
            assertEquals(5.0, add(2.0, 3.0))
        }

        @Test
        fun `decimal addition`() {
            assertEquals(3.24, add(8.44, -5.2), .05)
        }
    }

    @Nested
    inner class CalculatorSubtractionFunction {
    
        @Test
        fun `integer subtraction`() {
            assertEquals(5.0, subtract(12.0, 7.0))
        }

        @Test
        fun `decimal subtraction`() {
            assertEquals(0.95, subtract(10.05, 9.10), .05)
        }
    }

}