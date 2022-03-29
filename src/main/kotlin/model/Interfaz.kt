package model

class Interfaz() {

    init{

    }

    fun entregar(serie:Serie):Unit{
        serie.entregado = true
    }

    fun devolver(serie:Serie):Unit{
        serie.entregado = false
    }

    fun isEntregado(serie:Serie):Boolean{
        return serie.entregado
    }

    // ---------------------------------------------

    fun entregar(video:Videojuego):Unit{
        video.entregado = true
    }

    fun devolver(video:Videojuego):Unit{
        video.entregado = false
    }

    fun isEntregado(video:Videojuego):Boolean{
        return video.entregado
    }

}