package Reto3

class Reto3 {

    fun esPrimo(numero: Int): Boolean {

        if(numero <= 1)
            return false

        // este ciclo itera desde 2 hasta "numero" pero sin incluir el valor de numero
        for (i in 2 until numero){
            if(numero % i == 0)
                return false
        }

        return true

    }
}
