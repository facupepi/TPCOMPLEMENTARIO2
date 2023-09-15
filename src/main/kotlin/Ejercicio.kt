abstract class Ejercicio(
    var nombre : String,
    var coeficienteDeAjuste : Double
){
    abstract fun calorias() : Double
}