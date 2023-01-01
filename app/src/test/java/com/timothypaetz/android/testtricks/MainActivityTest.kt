package com.timothypaetz.android.testtricks

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.mock

class MainActivityTest {

    @Test
    fun `verify no name user returns false for hasCompletedProfile`() {
        // given
        val mainActivity: MainActivity = mock(defaultAnswer = CALLS_REAL_METHODS)
        val noNameUser = User(name = null)

        // when
        val actual = mainActivity.hasCompletedProfile(noNameUser)

        // then
        assertFalse(actual)
    }

    @Test
    fun `verify named user returns true for hasCompletedProfile`() {
        // given
        val mainActivity: MainActivity = mock(defaultAnswer = CALLS_REAL_METHODS)
        val namedUser = User(name = "Timothy Paetz")

        // when
        val actual = mainActivity.hasCompletedProfile(namedUser)

        // then
        assertTrue(actual)
    }
}