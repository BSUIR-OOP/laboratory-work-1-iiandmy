package entities.shapes.abstractions

import entities.shapes.Point

abstract class SymmetricShape(point: Point, side: Double): Shape(point, side, side) {
    abstract override fun toString(): String
}