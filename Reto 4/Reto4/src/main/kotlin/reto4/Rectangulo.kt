package reto4

data class Rectangulo(val base: Double, val altura: Double): Poligono {
    override fun area(): Double {
        return base * altura
    }

    override fun printArea() {
        println("El área del rectángulo es ${area()}")
    }
}