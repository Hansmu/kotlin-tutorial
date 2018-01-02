package com.github.kotlintutorial

fun main(args: Array<String>) {
    //  Default visibility of top level things - functions, properties etc. is public unlike Java where it's package private.
    //  Private top level things can be accessed in the same file. You can define more than one class in one file. You can define them private as they can be seen in the file.
    //  Internal means it's only visible in the same module
    //  Mixing Java and Kotlin can create some encapsulation problems. If there's a really long and ugly name in a Kotlin file, it probably means it was compiled into Java and was limited to private.
    val employee = EmployeeBloke()
    println(employee)
}

private class EmployeeBloke {

}