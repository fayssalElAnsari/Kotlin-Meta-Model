## Project Description
In this project we will try to build a meta model for the famous programming language KOTLIN.


* In each step of the meta-model development, we will try to reproduce a code snippet with increasing complexity. In a way that reflects the logic behind the Kotlin language. While avoiding to build unecessary entities and reusing entities when possible, and using the right type of relationship between them. Our goal is to let the user generate a syntaxicly **correct** code from a built kotlin program model.


## Meta Model Features
### 1.
* [ ] Comments
```kotlin
// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

/* The comment starts here
/* contains a nested comment *⁠/
and ends here. */
```
* [ ] Program Entry Point (main functin)
```kotlin
fun main() {
    println("Hello world!")
}

fun main(args: Array<String>) {
    println(args.contentToString())
}
```
* [ ] Functions
```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
```
* [ ] Variables
```kotlin
val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment

var x = 5 // `Int` type is inferred
x += 1

val PI = 3.14
var x = 0

fun incrementX() { 
    x += 1 
}
```
* [ ] Package definition and imports
```kotlin
package my.demo

import kotlin.text.*

// ...
```
* [ ] Creating classes and instances
```kotlin
class Shape

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

val rectangle = Rectangle(5.0, 2.0)
println("The perimeter is ${rectangle.perimeter}")

open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}
```
* [ ] Print to the standard output
```kotlin
print("Hello ")
print("world!")

println("Hello world!")
println(42)
```

### 2.
* [ ] String templates
* [ ] Conditional expressions
* [ ] for loop
* [ ] while loop
* [ ] when expression 

### 3.
* [ ] Ranges
* [ ] Collections
* [ ] Nullable values and null checks
* [ ] ...

see also: https://kotlinlang.org/docs/basic-syntax.html 


## Usage
To collaborate on this project: 
1. clone the repostory in a directory of your choice 
2. open eclipse modeling 
3. set the current workspace to the `Kotling - Model Files` folder
4. edit!

**the default eclipse runtime workspace is used**