package entities.shapes

import entities.shapes.abstractions.SymmetricShape

class Circle(point: Point, diameter: Double): SymmetricShape(point, diameter) {
    override fun toString(): String {
        return "Circle [p=$point, d=$width]"
    }
}