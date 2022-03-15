package entities.shapes

import entities.shapes.abstractions.Shape

class Ellipse(point: Point, width: Double, height: Double): Shape(point, width, height) {
    override fun toString(): String {
        return "Ellipse [p=$point, d1=$width, d2=$height]"
    }
}