fun main(){
    /*Usando el Ciclo While para que en caso de que escriba un dato incorrecto ejecute de nuevo
    hasta que obtenga una respuesta valida*/
    var num = 1
    while(num <= 5){ // Mientras la condicion sea verdadera se ejecuta el ciclo
        println(num)
        num++
    }

    println("¿Como te llamas?")
    var  nombreUsuario = readln()
    var actualYear: Int
    var bornYear : Int
    val factor = -1
    var edad : Int

    while(true){
        try{
            println("Dime en que año estamos")
            actualYear = readln().toInt() // Parseamos a entero porque readln() siempre espera un String
            println("Dime en que año naciste ")
            bornYear = readln().toInt()
            break
        }catch (e:NumberFormatException){
            println("Error!!!! Escribe un año valido $e")
        }
    }
    edad = (bornYear - actualYear) * factor
    println("Tienes " + edad +" años")


}
