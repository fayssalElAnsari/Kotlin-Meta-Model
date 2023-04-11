primitive Int0;
primitive Void;

class Rectangle(width: Int0, height: Int0) {
    fun area(): Int0 {
        return width * height
    }
}

fun main(): Void {
    let rectangle = Rectangle(10, 20)
    println(rectangle.area())
}