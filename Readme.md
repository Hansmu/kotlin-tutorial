Kotlin can run anywhere the JVM can run

Kotlin is interoperable with Java. Can just drop Kotlin code into Java classes.

Kotlin compiler takes .kt extension files as input and generates bytecode as .class files. When distributing Kotlin applications, have to distribute the Kotlin runtime library.

Can use functional programming (can use functions as values - can return them from functions, use them as parameters)

Kotlin does not need semicolons at the end of the lines.

Kotlin standard library has wrappers for common Java methods (println -> System.out.println)

Kotlin has soft and hard keyword. Soft keywords are keywords that can be used in different places based on context. Hard keywords can only be used where they're intended (val can only be used on the declaration)

Kotlin does not have a static keyword. The concept of static is still there.

There is no "new" keyword in Kotlin.

In Java == checks for referential equality. .equals() looks for structural equality.

In Kotlin == checks for structural equality. === checks for referential equality. Equals method still has to be implemented.