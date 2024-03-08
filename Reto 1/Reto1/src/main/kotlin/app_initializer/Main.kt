package app_initializer

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 */
import Reto1.Reto1
/*
 El parámetro args en la función main es un arreglo (Array) de cadenas (String)
 que se utiliza para pasar argumentos de línea de comandos al programa
 */
fun main(args: Array<String>) {
    val inst = Reto1()

    val evalua = inst.esAnagrama("roma", "amor")

    if(evalua){
        println("Es un anagrama")
    }else {
        println("No es un anagrama")
    }

}