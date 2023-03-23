class Vehiculos {
    var marca : String? = null
    var modelo : String? = null
    var sku : String? = null

    constructor(_marca : String, _modelo : String){
        marca = _marca
        modelo = _modelo
    }

    constructor(_sku : String){
        sku = _sku
    }

    fun acelerar() {
        if (marca != null && modelo != null) {
            println("El vehiculo marca $marca y modelo $modelo acelera")
        }else{
            println("El vehiculo $sku acelera")
        }
    }

    fun acelerar(km : Int) {
        if (marca != null && modelo != null) {
            println("El vehiculo marca $marca y modelo $modelo acelera hasta ${km}km por hora")
        }else{
            println("El vehiculo $sku acelera hasta ${km}km por hora")
        }
    }
}