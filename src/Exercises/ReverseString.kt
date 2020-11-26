package Exercises


fun reverseUsingSB(str: String) : String = str.reversed()

fun reverseUsingLoop(str: String) : String {
    var retorno = ""
    for(i in 1..(str.length)) retorno += str[str.length-i]
    return retorno
}