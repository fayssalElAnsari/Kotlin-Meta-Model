Int0 Int //isn't necessary in a real Kotlin program

class Rectangle(var width: Int, var height: Int) {
    fun area(): Int {
    	return width * height;
    }
}

fun main() {
	/*sadly, although this comment is well transcribed, 
	 * the arguments for a class or a print are not of the correct type
	 * for this version.
	 * */
	val rectangle = Rectangle("10","20");
	println("rectangle.area()");
}
