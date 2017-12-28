package com.github.kotlintutorial

import com.github.kotlintutorial.javacode.DummyClass

fun main(args: Array<String>) {
    // Data types are the same as in Java because Kotlin builds for the JVM
    val myInt = 10
    var myLong = 22L // L suffixes are still used
    // Kotlin does not automatically widen numbers
    // myLong = myInt does not work
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    // Double is the default data type
    var myDouble = 65.414
    val myFloat = 848.8492f
    println(myDouble is Double)
    println(myInt is Int)

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    val myChar: Char = myCharInt.toChar()

    val myBoolean = true

    // We can treat the Java class as a Kotlin class
    val vacationTime = false // Primitive type classes compile to the primitive types under the covers
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    // Any class is the root of the objects. Kind of like how the Object class is in Java.

    val anything: Any = Any()

    anything.equals(anything)
    anything.hashCode()
    anything.toString()

    // Unit class is same as the void class in Java. In Java void isn't really a data type. Kotlin uses the Unit class for a function that doesn't return anything.
    // Unit actually exists in Kotlin. It returns a singleton Unit instance.
    // Kotlin has a Nothing class. You can use it to return from a function that'll never actually return. Ex infinite loop
}