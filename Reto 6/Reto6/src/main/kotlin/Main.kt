
/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 */
fun main() {
    //println(cadena.count()) //Imprime el numero total de elementos de la cadena coleccion
    invierteCadena("Hola mundo")
}

fun invierteCadena(cadena: String) {
    for (i in (cadena.count() -1) downTo 0) {
        println(cadena[i])
    }
}


