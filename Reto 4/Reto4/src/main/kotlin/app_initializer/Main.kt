package app_initializer
import reto4.*

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 */

fun main() {
    
    val triangulo = Triangulo(10.0, 5.0)
    val rectangulo = Rectangulo(2.0, 5.0)
    val cuadrado = Cuadrado(4.0)

    fun area(polygon: Poligono): Double {
        polygon.printArea()
        return polygon.area()
    }

    area(triangulo)
    area(rectangulo)
    area(cuadrado)
}

