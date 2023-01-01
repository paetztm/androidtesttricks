package com.timothypaetz.android.testtricks

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.mock

class MainActivityTest {

    private val mainActivity = mock(MainActivity::class.java)

    @Test
    fun verifyMockitoWorks() {
        assertNotNull(mainActivity)
    }
}