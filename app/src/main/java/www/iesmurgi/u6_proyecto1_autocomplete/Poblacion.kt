package www.iesmurgi.u6_proyecto1_autocomplete

data class Poblacion(val nombre:String, val distancia:Int, val descripcion: String) {
    companion object {
        val poblacionSource = listOf(
            Poblacion("Almeria", 40, "Ciudad costera del sur")
            ,Poblacion("Almerimar", 15, "Ciudad costera del sur")
            ,Poblacion("Aguadulce", 40, "Ciudad costera del sur")
            ,Poblacion("Adra", 15, "Ciudad costera del sur")
            ,Poblacion("Azahara de los Atunes", 40, "Ciudad costera del sur")
            ,Poblacion("Albolote", 15, "Ciudad costera del sur")
            ,Poblacion("Alcaudique", 15, "Ciudad costera del sur")
        )
    }

    override fun toString(): String {
        return nombre
    }
}
