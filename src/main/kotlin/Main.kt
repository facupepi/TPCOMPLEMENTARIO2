fun main() {
    val ejercicio1 = Aerobico("Calistenia",5,35.0)
    val ejercicio2 = Aerobico("Cinta",3)
    val ejercicio3 = Anaerobico("Pesas 1",10.0,1,75.0)
    val ejercicio4 = Anaerobico("Pesas 2",20.0,2)

    val entrenamiento1 = Entrenamiento("Facundo", "Lunes")
    val entrenamiento2 = Entrenamiento("Santiago","Martes")

    entrenamiento1.agregarEjercicio(ejercicio1)
    entrenamiento1.agregarEjercicio(ejercicio3)
    entrenamiento2.agregarEjercicio(ejercicio2)
    entrenamiento2.agregarEjercicio(ejercicio4)

    println("\n"+entrenamiento2.toString())
    println("\n"+entrenamiento1.toString())

    val gestor = GestorDeEntrenamientos()
    gestor.agregarEntrenamiento(entrenamiento1)
    gestor.agregarEntrenamiento(entrenamiento2)

    println( "Ejercicios del socio Facundo: ${gestor.ejerciciosDelSocio("Facundo")}" )
    println( "Ejercicios del socio Facundo: ${gestor.ejerciciosDelSocio("Santiago")}" )

    println( "El socio mas enérgico fue: ${gestor.socioMasEnergico()}" )
}