package com.timothypaetz.android.androidtesttricks

import android.telephony.PhoneNumberUtils

class Trick2(
    private val userEnteredPhoneNumber: String
) {
    fun getFormattedNumber(): String {
        return PhoneNumberUtils.formatNumber(userEnteredPhoneNumber, "US")
    }
}