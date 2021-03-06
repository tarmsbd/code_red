package com.tarmsbd.schoolofthought.codered.app.data.models

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Report(
    var patientName: String,
    var mobile: String,
    var location: String,
    var gender: String,
    var dateOfBirth: String,
    var desc: String
) {
    constructor() : this("", "", "","","", "")

    @Exclude
    fun toMap(): Map<String, String> {
        return mapOf(
            "patientName" to patientName,
            "mobile" to mobile,
            "location" to location,
            "gender" to gender,
            "dateOfBirth" to dateOfBirth,
            "desc" to desc
        )

    }
}