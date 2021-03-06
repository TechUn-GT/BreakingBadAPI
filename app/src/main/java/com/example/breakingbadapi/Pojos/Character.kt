package com.example.breakingbadapi.Pojos

import java.io.Serializable

class Character : Serializable {
    var char_id: Int? = 0
    var name: String? = null
    var birthday: String? = null
    var occupation: List<String>? = null
    var img: String? = null
    var status: String? = null
    var nickname: String? = null
    var appearance: List<Int>? = null
    var portrayed: String? = null
    var category: String? = null
    var better_call_saul_appearance: List<Int>? = null
    var isSelected: Boolean = false
}
