package com.timothypaetz.android.androidtesttricks

import org.junit.Assert.*
import org.junit.Test

class Trick2Test {

    @Test
    fun verifyPhoneFormatIsCorrect() {
        // given
        val expected = "(555) 555-1234"
        val trick2 = Trick2("5555551234")

        // when
        val actual = trick2.getFormattedNumber()

        // then
        assertEquals(expected, actual)
    }

}