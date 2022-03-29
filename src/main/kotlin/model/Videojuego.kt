package model

class Videojuego() {
    var titulo:String
    var horasEstimadas:Int
    var entregado:Boolean
    var genero:String
    var compania:String

    init{
        this.titulo = "indef"
        this.horasEstimadas = 10
        this.entregado = false
        this.genero = "indef"
        this.compania = "indef"
    }

    constructor(titulo_s:String, horasEstimadas_s:Int,
                genero_s:String,compania_s:String):this(){
        this.titulo = titulo_s
        this.horasEstimadas = horasEstimadas_s
        this.entregado = false
        this.genero = genero_s
        this.compania = compania_s
    }

    constructor(titulo_s:String, horasEstimadas_s:Int):this(){
        this.titulo = titulo_s
        this.horasEstimadas = horasEstimadas_s
        this.entregado = false
        this.genero = "indef"
        this.compania = "indef"
    }
}