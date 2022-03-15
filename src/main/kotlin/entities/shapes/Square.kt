package entities.shapes

import entities.shapes.abstractions.SymmetricShape

class Square(point: Point, side: Double): SymmetricShape(point, side) {
    override fun toString(): String {
        return "Square [p=$point, a=$height]"
    }
}