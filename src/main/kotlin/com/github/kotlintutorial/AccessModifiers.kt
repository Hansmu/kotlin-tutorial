package com.github.kotlintutorial

fun main(args: Array<String>) {
    //  Default visibility of top level things - functions, properties etc. is public unlike Java where it's package private.
    //  Private top level things can be accessed in the same file. You can define more than one class in one file. You can define them private as they can be seen in the file.
    //  Internal means it's only visible in the same module
    //  Mixing Java and Kotlin can create some encapsulation problems. If there's a really long and ugly name in a Kotlin file, it probably means it was compiled into Java and was limited to private.
    val employee = EmployeeBloke()
    println(employee)

    val kotlinEmployee = KotlinEmployeeLongWay("John")
    println(kotlinEmployee.firstName)

    val alsoKotlinEmployee = KotlinEmployee("Johnathan")
    println(alsoKotlinEmployee.firstName)

    val otherEmployee = KotlinEmployee("Bobberts", false)
    println(otherEmployee.fullTime)
}

//  Kotlin will automatically assign the same properties from the constructor parameters, so there isn't any point in declaring like below.
//  Could remove the constructor keyword as well. However can't do that when using annotations or access modifiers. E.g. if you set it to protected
//  protected constructor(val firstName: String)
//  Parameter can also be var of course.
//  Most time you can assign default values, so you won't really need a secondary constructor.
//  When you have a variable you aren't actually accessing it directly, Kotlin generates getters and setters for the values.
//  Private variables are only limited to being changed within the class.
//  In order to create your own custom getter and setter you have to remove the variable declaration from the constructor.
class KotlinEmployee constructor(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime
    //  Custom set and get have to come immediately after the variable declaration
    get() {
        println("Running the custom get")
        return field    //  References the field that is before the get
    }
    set(value) {
        println("Runnin the custom set")
        field = value
    }
}

// Primary constructor is defined here. You can define more inside the class, if it's outside of the curlies, then it's a primary constructor.
class KotlinEmployeeLongWay constructor(firstName: String){
    val firstName: String
    var fullTime: Boolean = true

    //  All of the secondary constructors have to delegate to the primary constructor, use this() to do it.
    //  Using val or var in the secondary constructor does not lead to the variables being declared for us. Only the primary constructor does.
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }

    //  This is not a constructor. This runs when a new instance is created. It runs in conjunction with a primary constructor.
    init {
        this.firstName = firstName
    }
}

private class EmployeeBloke {

}