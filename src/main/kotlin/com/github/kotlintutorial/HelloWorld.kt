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
}

class Employee(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }
}