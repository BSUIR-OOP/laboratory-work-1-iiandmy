package entities.shapes.abstractions

import entities.shapes.Point

abstract class Shape(var point: Point, var width: Double, var height: Double) {
    abstract override fun toString(): String
}