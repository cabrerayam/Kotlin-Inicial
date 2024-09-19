fun main(){

    // ESTRUCTURA DE CONTROL IF
    val x = true
    if (x) {
        println("Es verdadero")
    } else {
        println("Es falso")
    }

    // IF + ELSE IF
    val edad = 18
    if(edad === 18){
        println("Tiene los 18 años cumplidos")
    } else if(edad > 18){
        println("Es mayor de 18 años")
    } else{
        println("Es menor de edad")
    }

    //IF ANIDADOS: UN IF DENTRO DE OTRO IF
    val sexo = "M"
    if(edad === 18){
        println("Tiene los 18 años cumplidos")
        if(sexo === "M"){
            println("Le toca servicio militar obligatorio")
        }else{
            println("El servicio militar el opcionar")
        }
    } else if(edad > 18){
        println("Es mayor de 18 años")
    } else{
        println("Es menor de edad")
    }

    // ESTRUCTURA DE CONTROL SWITH O WHEN

    var dia = 1
    when(dia){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        else -> println("El numero no es un día valido")
    }

    val y = 5
    when (y){
        in 1..10 -> println("Esta en el rango")
        in 10 ..20 -> println("Esta fuera del rango")
    }


}
