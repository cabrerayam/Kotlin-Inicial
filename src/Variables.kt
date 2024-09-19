fun main(){
 //   println("Hello World")

    /*Declaración de Variables: Usamos la variable reservada var */
    var esUnEntero = 1
    println(esUnEntero)

    var esUnDouble = 2.1
    println(esUnDouble)

    esUnDouble = 4.5
    println(esUnDouble)

    var texto1 = "Hola"
    var texto2 = "Mundo"
    println(texto1 + " " + texto2)


    /*Declaración de Constantes: Usamos la variable reservada val  */
    val pi = 3.1416


    /*Null Safety: Valores Opcionales: Declaramos una variable que puede ser null*/
    var x : String? = null
    //x = "Hola"
    //println(x)
    x?.let {
        println("tiene valor")
    }

    // Caso de Uso: llevar de una pantalla "a" a una pantalla "b"
    var id : Int? = null
    id?.let {
        println("tiene valor")
    }

    /* Cambio de tipo de dato y concatenaciones */
    var num1 = 5
    var num2 = "10"
    var resultado = num1 + num2.toInt()// Transformo el num2 a numero para poder sumar
    var resultado2 = num1.toString() + num2 // Imprime los dos numeros juntos pero no hace la suma porque ambos son String
    println(resultado2)

    var nombre = "Yamileth"
    var apellido = "Cabrera"
    println(nombre + " " + apellido)
    println("Soy la: ${num2}")
    var otroTecnicaDeConcatenado = nombre.plus(" ").plus(apellido) //Usando plus
    println(otroTecnicaDeConcatenado)
    var array = arrayOf("Hola", "Yami")
    var arrayConcatenado = array.joinToString(" ") //Le indicamos que una los elementos del array y los separa con un espacio
    println(arrayConcatenado)

    /*Escribir en la consola*/
    println("¿Como te llamas?")
    var  nombreUsuario = readln()
    println("Hola " + nombreUsuario)

    println("Dime en que año estamos")
    var actualYear = readln().toInt() // Parseamos a entero porque readln() siempre espera un String
    println("Dime en que año naciste ")
    var bornYear = readln().toInt()
    val factor = -1
    var edad = (bornYear - actualYear) * factor
    println("Tienes " + edad +" años")

    /*Try Catch: Excepciones: Ayuda a generar una salida en caso de que haya un error*/
    try{
        println(nombreUsuario + " ¿En que año nacio tu madre?")
        var bornYearOfMom = readln().toInt()
        var edadOfMom = (bornYearOfMom - actualYear) * factor
        println("Tu madre actualmente tiene " + edadOfMom + " años")
    }catch (e:NumberFormatException){
        println("Error!!!! Escribe un año valido")

    }

}
