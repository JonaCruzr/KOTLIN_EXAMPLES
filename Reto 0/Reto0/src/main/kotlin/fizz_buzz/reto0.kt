package fizz_buzz

/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 */

class Reto0 {

    fun numeros() {
        for (i in 1..100){
            val divisibleX3 = i % 3 == 0
            val divisibleX5 = i % 5 == 0

            if(divisibleX3 && divisibleX5){
                println(" $i fizzbuzz")
            } else if (divisibleX5){
                println(" $i buzz")
            } else if (divisibleX3){
                println(" $i fizz")
            } else{
                println(" $i")
            }
        }
    }
}