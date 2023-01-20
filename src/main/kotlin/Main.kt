fun main() {
    println("test False"+" "+"El producto esta hecho en Ecuador?"+" " +testValidarCodigoFalse())
    println("test True"+" "+"El producto esta hecho en Ecuador?"+" " +testValidarCodigoTrue())
}


    fun validarCodigo(code:String):Boolean{
        val codeEc ="768"
        val subcode=code.substring(0,3)
        return subcode==codeEc
    }

    fun testValidarCodigoFalse():Boolean{
        val esp=false
        val res=validarCodigo("2713111357")
        return esp==res
    }

    fun testValidarCodigoTrue():Boolean{
        val esp=true
        val res=validarCodigo("7683111357")
        return esp==res
    }

