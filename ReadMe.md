## Project Description
In this project we will try to build a meta model for the famous programming language KOTLIN.

<img src="https://github.com/fayssalElAnsari/Kotlin-Meta-Model/blob/0a17f915f7da55f62969caa99fee786c07d5a5df/Kotlin%20-%20Model%20Files/KotlinMetaModel/model/kotlinMetaModel.png" width="300">

## General Notes
* In each step of the meta-model development, we will try to reproduce a code snippet with increasing complexity. In a way that reflects the logic behind the Kotlin language. While avoiding to build unecessary entities and reusing entities when possible, and using the right type of relationship between them. Our goal is to let the user generate a syntaxicly **correct** code from a built kotlin program model.

* The order of execution of steps is the same as the order of adding childs to an entity.

* In Kotlin, functions are considered first-class constructs. This means that functions can be treated as a data type. You can store functions in variables, pass them to other functions as arguments, and return them from other functions.

## Meta Model Features
### 1.
* [x] Comments
```kotlin
// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

/* The comment starts here
/* contains a nested comment *⁠/
and ends here. */
```
<img src="https://github.com/fayssalElAnsari/Kotlin-Meta-Model/blob/47a9d027e9aae83341f24778667aff1908fc37af/Kotlin%20-%20Model%20Files/KotlinMetaModel/model/CommentModel.png" width="300">


* [x] Package definition and imports
```kotlin
package my.demo

import kotlin.text.*

// ...
```
<img src="https://github.com/fayssalElAnsari/Kotlin-Meta-Model/blob/ddf4b69407e7fbaed2ee9a3813543ad74bc3df41/Kotlin%20-%20Model%20Files/KotlinMetaModel/model/PackageModel.png" width="300">


* [x] Variables
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
    * we differentiate between immediate and deffered assignment using a boolean attribute on our declaration class
    * we have the possibility to reference one assignment object in our model, it should be required if immediateAssignment is set to `true`, and that assignment should be skipped while generating code (since both the declaration and assignment will be considered as one compound instruction).

* [ ] Print to the standard output
```kotlin
print("Hello ")
print("world!")

println("Hello world!")
println(42)
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

* [ ] Program Entry Point (main functin)
```kotlin
fun main() {
    println("Hello world!")
}

fun main(args: Array<String>) {
    println(args.contentToString())
}
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
