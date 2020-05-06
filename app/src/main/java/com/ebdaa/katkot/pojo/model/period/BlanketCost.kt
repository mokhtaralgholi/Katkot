package com.ebdaa.katkot.pojo.model.period

class BlanketCost(var type: String?, var quantity: Double, var price: Double, var total: Double) {

    var id: Int = 0         // Primary Key of This Table
    var idPeriod: Int = 0   // Primary Key
    var idFarm: Int = 0     // Primary Key
    var dateTime: String? = null // Date of Record
}
