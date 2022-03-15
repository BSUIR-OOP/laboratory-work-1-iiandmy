package entities.shapes

import entities.shapes.abstractions.SymmetricShape

class EquilateralTriangle(point: Point, side: Double): SymmetricShape(point, side) {
    override fun toString(): String {
        return "EquilateralTriangle [p=$point, a=$width]"
    }
}