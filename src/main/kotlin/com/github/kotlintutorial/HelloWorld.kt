package com.github.kotlintutorial

// No imports for array and such because Kotlin imports a whole bunch of stuff by default from the Kotlin standard library. It's to cut down on boilerplate.

// Functions outside of classes are top level functions
fun main(args: Array<String>) {
    //  The code isn't actually outside of a class. It's just when we're writing the code we don't have to have it in a class.
    // It still gets put inside a class.

    // Kotlin uses type inference - the compiler can usually figure out or infer the type of the variable based on the context. This is done on compile time, not run time.
    var world = "world"
    // Val means the variable can only be assigned once - a constant.
    // Var means that it can be reassigned.
    // Type of the variable cannot be changed.
    val hello = "hello"

    val number: Int // With no value assigned you have to give it the context.
    val numberShort: Short = 25 // Default value is int, have to specify if you want a short.

    println("$hello, $world!")

    val employeeOne = Employee("Lynn Jones", 500)
    employeeOne.name = "Lynn Smith"
}

class Employee(var name: String, val id: Int) {

}