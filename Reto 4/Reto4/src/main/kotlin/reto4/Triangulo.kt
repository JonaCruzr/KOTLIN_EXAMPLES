package reto4

data class Triangulo(val base: Double, val altura: Double): Poligono{
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun printArea() {
        println("El área del triángulo es ${area()}")
    }
}

