fun main(){

    for( i  in 1..5){
        println(i)
    }

    for (a in 'a'..'f'){
        println(a)
    }

    //Imprime de forma descendente usando el downTo
    for (b in 'f' downTo 'a'){
        println(b)
    }

    val users = arrayOf("Luis","Ramon","Diana","Laura")
    for(user in users.indices){// Para ver la posicion
        println(user)
    }

    for (user in users.indices){
        println("[$user] , ${users[user]}]")// Para ver la posicion y el valor
    }



}
