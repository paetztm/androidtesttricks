package com.timothypaetz.android.androidtesttricks

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class Trick3ActivityTest {

    @Test
    fun `verify no name user returns false for hasCompletedProfile`() {
        // given
        val trick3Activity: Trick3Activity = mock(defaultAnswer = Mockito.CALLS_REAL_METHODS)
        val noNameUser = User(name = null)
        trick3Activity.user = noNameUser // manually inject user here

        // when
        val actual = trick3Activity.hasCompletedProfile()

        // then
        assertFalse(actual)
    }

    @Test
    fun `verify named user returns true for hasCompletedProfile`() {
        // given
        val trick3Activity: Trick3Activity = mock(defaultAnswer = Mockito.CALLS_REAL_METHODS)
        val namedUser = User(name = "Timothy Paetz")
        trick3Activity.user = namedUser // manually inject user here

        // when
        val actual = trick3Activity.hasCompletedProfile()

        // then
        assertTrue(actual)
    }

}