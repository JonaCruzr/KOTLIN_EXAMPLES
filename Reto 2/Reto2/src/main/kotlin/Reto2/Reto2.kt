package Reto2

class Reto2 {

    fun sumaAnteriores(n1: Long, n2: Long) : Long {
        return n1 + n2
    }

    fun fibo(){
        var n1: Long = 0
        var n2: Long = 1
        println("Fibonacci 0: $n1")
        println("Fibonacci 1: $n2")

        for (i in 2..50){
            var n = sumaAnteriores(n1, n2)
            println("Fibonacci ${i}: $n")

            n1 = n2
            n2 = n
        }
    }
}