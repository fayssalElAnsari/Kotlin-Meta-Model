Int0 Int

class Rectangle(width: Int, height: Int) {
    fun area(): Int {
    	val area : Int;
    	return width * height;
    }
}

fun main(): Int {
	val rectangle = Rectangle("10", "20");
    //"println(rectangle.area())";
}

