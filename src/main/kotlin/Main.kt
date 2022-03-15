import entities.ShapeList
import entities.shapes.*

fun main() {
    val shapes = ShapeList(listOf(
        Circle(Point(1.0, 1.0), 5.0),
        Ellipse(Point(2.0, 2.0), 10.0, 5.0),
        EquilateralTriangle(Point(3.0, 1.0), 7.0),
        Rectangle(Point(5.1, 1.0), 20.0, 10.0),
        Rhombus(Point(6.5, 1.0), 7.0, 6.0),
        Square(Point(4.0, 10.0), 10.0)
    ))

    shapes.drawShapes()
}