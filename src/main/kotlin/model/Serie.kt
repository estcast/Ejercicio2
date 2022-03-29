package model



class Serie() {
    var titulo:String
    var numTemporadas:Int
    var entregado:Boolean
    var genero:String
    var creador:String

    init{
        this.titulo = "indef"
        this.numTemporadas = 3
        entregado = false
        genero = "indef"
        creador = "not_specified"
    }

    constructor(titulo_s:String, creador_s:String): this(){
        this.titulo = titulo_s
        this.creador = creador_s
        this.numTemporadas = 3
        this.entregado = false
        this.genero = "indef"
    }

    constructor(titulo_s: String, numTemporadas_s: Int, genero_s: String, creador_s: String): this() {
        this.titulo = titulo_s
        this.numTemporadas = numTemporadas_s
        this.entregado = false
        this.genero = genero_s
        this.creador = creador_s
    }


}