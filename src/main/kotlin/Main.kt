
import model.Serie
import model.Videojuego
import model.Interfaz

fun main(args: Array<String>) {



    var s1 = Serie("vaqueros",2,"accion","pedro")
    var s2 = Serie("rambo",3,"estrategia","jhon")
    var s3 = Serie("titanic",4,"romance","steve")
    var s4 = Serie("spider man",5,"accion","juan")
    var s5 = Serie("iron man",6,"accion","sara")

    var v1 = Videojuego("red dead",45,"accion","rockstar")
    var v2 = Videojuego("gta",45,)
    var v3 = Videojuego("rayman",15,"aventura","Ubisof")
    var v4 = Videojuego("mario",5,"platforms","nintendo")
    var v5 = Videojuego()

    var series = arrayOf<Serie>(s1,s2,s3,s4,s5)
    var videos = arrayOf<Videojuego>(v1,v2,v3,v4,v5)

    var inter = Interfaz()
    inter.entregar(v1)
    inter.entregar(v2)

    inter.entregar(s1)
    inter.entregar(s2)
    inter.entregar(s3)

    var contador = 0
    for(i in series.indices){
        if(series.get(i).entregado)
            contador++
    }

    var contador2 = 0
    for(i in videos.indices){
        if(videos.get(i).entregado)
            contador2++
    }

    println("Series entregados " + contador)
    println("Videojuegos entregados " + contador2)

}