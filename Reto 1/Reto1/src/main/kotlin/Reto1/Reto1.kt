package Reto1

class Reto1 {

    fun esAnagrama(palabra1: String, palabra2: String): Boolean {
        if (palabra1.lowercase() == palabra2.lowercase()) {
            return false
        }

        return palabra1.lowercase().toCharArray().sortedArray().contentEquals(palabra2.lowercase().toCharArray().sortedArray())
    }
}