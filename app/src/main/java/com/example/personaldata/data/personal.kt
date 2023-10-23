package com.example.personaldata.data

import android.accounts.AuthenticatorDescription
import java.net.Inet4Address


data class personal(
    val id : Int,
    val name : String,
    val address: String,
    val image : Int = 0
    )
