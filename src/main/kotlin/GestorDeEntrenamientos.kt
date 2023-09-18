class GestorDeEntrenamientos {
    private var entrenamientos : ArrayList<Entrenamiento> = arrayListOf()
    fun agregarEntrenamiento(entrenamientoTemp : Entrenamiento){
        entrenamientos.add(entrenamientoTemp)
    }
    fun ejerciciosDelSocio(socioTemp : String) : ArrayList<Ejercicio>{
        var ejerciciosDelSocioDeseado : ArrayList<Ejercicio> = arrayListOf()

        for (entrenamiento in entrenamientos){
            if(entrenamiento.socio == socioTemp){
                ejerciciosDelSocioDeseado = entrenamiento.ejercicios
            }
        }
        return ejerciciosDelSocioDeseado
    }

    fun socioMasEnergico() : String{
        var mejorSocio = ""
        var mayoresCalorias = 0.0

        for (entrenamientoTemp in entrenamientos){
            if(entrenamientoTemp.totalCalorias() > mayoresCalorias){
                mejorSocio = entrenamientoTemp.socio
                mayoresCalorias = entrenamientoTemp.totalCalorias()
            }
        }
        return mejorSocio
    }
}