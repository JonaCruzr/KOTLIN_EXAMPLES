package app_initializer


/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

import Reto3.Reto3

fun main() {
    val inst = Reto3()

    for (i in 1..100) {

        if(inst.esPrimo(i)){
            println("$i es un numero primo")
        }
    }
}