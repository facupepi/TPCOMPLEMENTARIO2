class Aerobico(
    nombre : String,
    private var minutos : Int,
    coeficienteDeAjuste : Double = 20.0
) : Ejercicio(nombre,coeficienteDeAjuste)

{
    override fun calorias(): Double {
        return (this.minutos * this.coeficienteDeAjuste)
    }
    override fun toString(): String {
        return "$nombre - Minutos: $minutos - Calorias: ${calorias()}"
    }
}