package reto4

data class Cuadrado(val lado: Double) : Poligono {
    override fun area(): Double {
        return lado * lado
    }

    override fun printArea() {
        println("El área del cuadrado es ${area()}")
    }

}