package com.tarmsbd.schoolofthought.codered.app.data.models

data class RecentStatus(val time: String, val gender: String, val age: String, val area: String) {
    constructor() : this("", "", "", "")
}