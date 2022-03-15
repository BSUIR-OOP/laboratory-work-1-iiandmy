package entities

import entities.shapes.abstractions.Shape

class ShapeList(var shapes: List<Shape>) {
    fun drawShapes() {
        shapes.forEach { shape ->
            println(shape)
        }
    }
}