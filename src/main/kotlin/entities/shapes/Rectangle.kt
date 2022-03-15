package entities.shapes

import entities.shapes.abstractions.Shape

class Rectangle(point: Point, width: Double, height: Double) : Shape(point, width, height) {
    override fun toString(): String {
        return "Rectangle [p=$point, w=$width, h=$height]"
    }
}