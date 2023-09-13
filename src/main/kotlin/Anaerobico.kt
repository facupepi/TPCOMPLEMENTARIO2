class Anaerobico(
    nombre : String,
    private var peso : Double,
    private var repeticiones : Int,
    coeficienteDeAjuste : Double = 30.0
): Ejercicio(nombre,coeficienteDeAjuste) {
    override fun calorias(): Double {
        return (peso * repeticiones * coeficienteDeAjuste)
    }
    override fun toString(): String {
        return "$nombre - Repeticiones: $repeticiones - Peso: $peso - Calorias: ${calorias()}"
    }
}