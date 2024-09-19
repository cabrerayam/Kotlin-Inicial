fun main(){
/*Listas:Hay dos tipos, las Inmutables y las Mutables*/
 //Para las Inmutables usamos listOf y a diferencia de los arrays estas listas no se pueden modificar
    val listaDeEdades = listOf(10,20,30,40,50,60,70,80)
    println(listaDeEdades)
    println(listaDeEdades[0])

    //Caso de uso: Una lista desplegable
    val listaDePaisesQueEmpiezanConLetraC = listOf("Canadá","Chile","China","Colombia","Cuba")

    // Las Mutables se declaran con mutableListOf y estas se comportan parecido al array, se pueden modificar
    var listaDeAnimales = mutableListOf("Perro","Gato", "Conejo","Delfín")
    listaDeAnimales.add("Leon") //Puedo agregar un elemento
    println(listaDeAnimales)
    listaDeAnimales.removeAt(3)// si el un entero uso remove, Aqui como dice index remueve el que esta en la posicion 3
    println(listaDeAnimales)

    //Para eliminar un elemento de un array puedo usar parsearlo a lista mutable y remover el elemento:
    val array = arrayOf(1,2,3,4,5)
    val arrayModificado = array.toMutableList()
    arrayModificado.remove(2)// Aqui como dice element remueve directamente el numero dos
    println(arrayModificado)


}
