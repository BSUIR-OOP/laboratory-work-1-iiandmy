package entities.shapes

class Point(var x: Double, var y: Double) {
    fun setLocation(x: Double, y: Double) {
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}