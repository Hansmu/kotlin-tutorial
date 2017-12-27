package com.github.kotlintutorial.challenge1

fun main(args: Array<String>) {
    println("Challenge 1")

    val hello1 = "Hello"
    val hello2 = "Hello"

    // There's only one string literal, if you use the same string, then they both reference the same string, it's a JVM optimization
    // Looks into a string pool, notices it exists already, uses the same.
    println("$hello1 and $hello2 they are equal referentially ${hello1 === hello2}, they are equal value wise ${hello1 == hello2}")

    var number = 2988

    var someVariable: Any = "The Any type is the root of the Kotlin class hierarchy"

    number = 2911

    if (someVariable is String) {
        println("Number declared is $number, ${someVariable.toUpperCase()}")
    }

    val multiline =
            """
            *   1
            *  11
            * 111
            *1111
            """.trimMargin("*")
    println(multiline)

    val multilineOnes =
            """
            1   1
            1  11
            1 111
            11111
            """.trimMargin("1")
    println(multilineOnes)
}