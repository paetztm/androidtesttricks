package com.timothypaetz.android.androidtesttricks

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.mock

class Trick1ActivityTest {

    /**
     * Mockito Example
     */
    @Test
    fun `verify no name user returns false for hasCompletedProfile`() {
        // given
        val trick1Activity: Trick1Activity = mock(defaultAnswer = CALLS_REAL_METHODS)
        val noNameUser = User(name = null)

        // when
        val actual = trick1Activity.hasCompletedProfile(noNameUser)

        // then
        assertFalse(actual)
    }

    @Test
    fun `verify named user returns true for hasCompletedProfile`() {
        // given
        val trick1Activity: Trick1Activity = mock(defaultAnswer = CALLS_REAL_METHODS)
        val namedUser = User(name = "Timothy Paetz")

        // when
        val actual = trick1Activity.hasCompletedProfile(namedUser)

        // then
        assertTrue(actual)
    }

    /**
     * Mockk example
     */
    @Test
    fun `verify no name user returns false for hasCompletedProfile using mockk`() {
        // given
        val trick1Activity = mockk<Trick1Activity>()
        val noNameUser = User(name = null)
        every { trick1Activity.hasCompletedProfile(noNameUser) } answers { callOriginal() }

        // when
        val actual = trick1Activity.hasCompletedProfile(noNameUser)

        // then
        assertFalse(actual)
    }

    @Test
    fun `verify named user returns true for hasCompletedProfile using mockk`() {
        // given
        val trick1Activity = mockk<Trick1Activity>()
        val namedUser = User(name = "Timothy Paetz")
        every { trick1Activity.hasCompletedProfile(namedUser) } answers { callOriginal() }

        // when
        val actual = trick1Activity.hasCompletedProfile(namedUser)

        // then
        assertTrue(actual)
    }
}