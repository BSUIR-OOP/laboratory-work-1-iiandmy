package entities.shapes

import entities.shapes.abstractions.Shape

class Rhombus(point: Point, width: Double, height: Double): Shape(point, width, height) {
    override fun toString(): String {
        return "Rhombus [p=$point, d1=$width, d2=$height]"
    }
}