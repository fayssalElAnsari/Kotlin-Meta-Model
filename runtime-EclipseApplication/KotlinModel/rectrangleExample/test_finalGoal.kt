class Rectangle(var width: Int, var height: Int) {
    fun area(): Int {
        return width * height
    }
}

fun main() {
    val rectangle = Rectangle(10, 20)
    println(rectangle.area())
}