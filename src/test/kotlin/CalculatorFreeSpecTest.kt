package com.neopragma.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.FreeSpec

class CalculatorFreeSpecTest : FreeSpec({  

    "addition" - {
        "when" {
            "we" {
                "add" {
                    "two" {
                        "and" {
                            "four" {
                                "we expect" {
                                    "to get" {
                                        "six" {
                                            add(2.0, 4.0) shouldBe exactly(6.0)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }  
}) 
