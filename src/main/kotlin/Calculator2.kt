package com.neopragma.calculator2

fun main(args: Array<String>) = println("Calculator")

fun add(num1: Double, num2: Double): Double {
    checkArguments(num1, num2)
    return num1 + num2
}

fun subtract(num1: Double, num2: Double): Double {
    checkArguments(num1, num2)
    return num1 - num2
}

fun multiply(num1: Double, num2: Double): Double {
    checkArguments(num1, num2)
    return "%.2f".format(num1 * num2).toDouble()
}

fun divide(num1: Double, num2: Double): Double {
    checkArguments(num1, num2)
    return "%.2f".format(num1 / num2).toDouble()
}

fun checkArguments(num1: Double, num2: Double): Unit {
    if ( (num1.equals(Double.NaN)) || (num2.equals(Double.NaN)) ) {
        throw IllegalArgumentException("Input values must be numbers.")
    }    
}