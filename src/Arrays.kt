fun main(){
    /*Array: Un array es un vector, una constante o variable que puede guardar mas de un valor*/
    var miBolsaDeGatos = arrayOf("Luigi", "Mario", 2, 2.2, true)
    println(miBolsaDeGatos.contentToString())

    var edades = intArrayOf (23, 10, 40, 45, 5)
    println(edades[1])

    //Puedo modificar el valor del array
    println(miBolsaDeGatos[1])
    miBolsaDeGatos[1] = "Mario Bross" // Asigno el nuevo valor en la posicion 1
    println(miBolsaDeGatos[1]) //Ahora me imprime el valor modificado

    //Tambien podemos contar el numero de elementos de la siguiente manera usando el size
    println(edades.size)

    //Podemos agregar elementos
    miBolsaDeGatos += "Yoshi"
    println(miBolsaDeGatos.contentToString())

    //Podemos ordenar el array usando el metodo sort, por defecto ordena de forma ascendente
    edades.sort()
    println(edades.contentToString())

    //Podemos tambier buscar numeros duplicados dentro del array
    //Agrego edades duplicadas a mi array de edades
    edades += 5
    edades += 23
    var edadesDuplicadas = edades.groupBy { it }.filter { it.value.size > 1 }.keys // Guarda los valores duplicados en una variable
    println(edadesDuplicadas)




}
