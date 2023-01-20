fun main(){
// llamar  a las funciones test
    println("Prueba 2 paso"+sizeLicPlateTest())
    println("Prueba 1 paso:"+sizeLicPlateTestCorrect())
    println("Prueba 3 paso:"+ getProvinceTest())
}

//CODIGO


fun sizeLicPlate(licPlate: String):Boolean{
    val tamaño = 8
    val  placa = licPlate.length
    return placa == tamaño
}
fun dashSeparate(licPlate: String):Boolean{
    val guion = "-"
    return licPlate.substring(3,4) == guion
}
fun getProvince(licPlate: String):String{
    val provincia = when (licPlate.substring(0,1)){
        "A" -> ("Azuay")
        "P" -> ("Pichincha")
        "G" -> ("Guayas")
        else -> "Desconocido"
    }
    return ("la placa es" + provincia)
}

//TEST

//Ejemplo
fun sizeLicPlateTestCorrect(): Boolean {
    val res = dashSeparate("GBC-1234")
    val esp= true
    return ( esp == res)
}
fun sizeLicPlateTest(): Boolean {
    val res = sizeLicPlate("GBC-1234")
    val esp= true
    return ( esp == res)
}

fun getProvinceTest(): Boolean {
    val res = getProvince("GBC-1234")
    val esp= "Guayas"
    return ( esp == res)
}
