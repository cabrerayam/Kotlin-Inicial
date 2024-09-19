fun main(){

    val list = listOf(1,2,3,4,5)
    list.forEach{
        println(it)
    }

    list.forEachIndexed{index, elemento -> println("Posicion $index del valor $elemento")} // Imprime la posicion y el valor

    

}
