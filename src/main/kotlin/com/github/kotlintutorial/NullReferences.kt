package com.github.kotlintutorial

fun main(args: Array<String>) {

    // If you want a variable to contain a null, you have to explicitly tell the compiler that
    val str: String? = null // What you can do with it is now limited or you have to use a null check
    if (str != null) {
        str.toUpperCase()
    }

    str?.toUpperCase() // Same as the if above.

    println("When calling null - ${str?.toUpperCase()}")

    // val countryCode: String? = bankBranch?.address?.country?.countryCode A lot more concise than nested null check ifs

    // Elvis operator is used to assign a default value when an expression is null. If str is null, then sets the second parameter as default.
    // str != null ? str : "This is the default value"
    val str2 = str ?: "This is the default value"

    // val countryCode = bankBranch?.address?.country?.countryCode ?: "US

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String // If you can't perform the cast successfully, then it evaluates to null
    // If you use the safe cast operator, then you have to use the safe call operator from henceforth
    println(str3)
}