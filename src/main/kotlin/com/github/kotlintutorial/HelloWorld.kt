package com.github.kotlintutorial

// Type alias - give a type a different name. Maybe to type less or to have a more meaningful type name.
// Have to be declared at the top level. Outside of any functions or classes.
typealias EmployeeSet = Set<Employee>

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

    val employees: EmployeeSet

    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    // == does structural comparison in Kotlin
    println("\nEquality check")
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))

    val x = 0x001001
    val y = 0x111011

    // You spell out the bitwise operators instead of using symbols
    x or y
    x and y
    x xor y

    val something: Any = employeeTwo // Any is kind of like object in Java, but not exactly
    if (something is Employee) { // !is
        something as Employee // Casting in Kotlin "something as employee"
        // Don't really have to cast if there is an if that checks the class type. Kotlin casts it automatically
        // If you assign something else to the employee, some other type, then you can't use it as an Employee anymore.
        println(something.name)
    }

    val change = 4.22
    println("\$ $change but add a dollar and you get ${change + 1}, right ${employeeOne.name}?")

    // Triple quoted strings allows you to not use escape characters
    // Also can use them for multi line Strings
    val filePath = """c:\dir\dir2\file.txt"""
    val nurseryRhyme = """

        Humpty Dumpty did a trumpty
        Little flumpy
        Pump the chumpty. $change
    """.trimIndent()

    println(nurseryRhyme)
}

class Employee(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}