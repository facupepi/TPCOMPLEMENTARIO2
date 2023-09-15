class Entrenamiento(
    var socio : String,
    var dia : String
) {
    var ejercicios : ArrayList<Ejercicio> = arrayListOf()
    fun agregarEjercicio(ejercicioTemp: Ejercicio){
        ejercicios.add(ejercicioTemp)
    }
    fun totalCalorias(): Double {
        var contadorCalorias = 0.0
        for(ejercicioTemp in ejercicios){
            contadorCalorias += ejercicioTemp.calorias()
        }
        return contadorCalorias
    }
    private fun ejercicioMayorCalorias() : Ejercicio?{
        var ejercicioMayor : Ejercicio? = null
        for(ejercicioTemp in ejercicios){
            if (ejercicioMayor == null || ejercicioTemp.calorias() > ejercicioMayor.calorias() ) {
                ejercicioMayor = ejercicioTemp
            }
        }
        return ejercicioMayor
    }
    override fun toString(): String {
        var cadenaTemp = ""

        for(ejercicioTemp in ejercicios){
            cadenaTemp +=ejercicioTemp.toString() + "\n"
        }
        return "Socio: $socio - Calorias: ${totalCalorias()} - Ejercicio con mas calorias: ${ejercicioMayorCalorias()}\n\n---Ejercicios del entrenamiento---\n$cadenaTemp"
    }

}