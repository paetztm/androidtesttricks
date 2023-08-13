package com.timothypaetz.android.androidtesttricks

import org.junit.Assert.*
import org.junit.Test

class Trick2Test {

    /**
     * This doesn't work since PhoneNumberUtils, which is part of
     * the Android platform, is not mocked
     * Same exact code works if you move it to androidTest
     */
    @Test
    fun verifyFormatter() {
        // given
        val expected = "555-555-1234"
        val trick2 = Trick2("5555551234")

        // when
        val actual = trick2.getFormattedNumber()

        // then
        assertEquals(expected, actual)
    }
}