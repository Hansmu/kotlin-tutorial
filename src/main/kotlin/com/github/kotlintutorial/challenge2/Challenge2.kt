package com.github.kotlintutorial.challenge2

import com.github.kotlintutorial.javacode.DummyClass

fun main(args: Array<String>) {
    var someFloat = -3847.384f
    var alsoSomeFloat: Float = -3847.384f

    var nullableFloat: Float? = null

    var shortArrays = shortArrayOf(1, 2, 3, 4, 5)

    var nullableInts = Array<Int?>(40) { i -> (i + 1) * 5}

    var charArray = charArrayOf('a', 'b', 'c')

    DummyClass().method1(charArray)

    val x: String? = "I AM IN UPPERCASE"

    var lowercase = x?.toLowerCase() ?: "I give up!"

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}