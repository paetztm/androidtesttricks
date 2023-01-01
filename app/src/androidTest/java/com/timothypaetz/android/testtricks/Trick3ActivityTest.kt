package com.timothypaetz.android.testtricks

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Trick3ActivityTest {

    @Test
    fun testInjectedNoNameUser() {
        launchActivity<Trick3Activity>().use { scenario ->
            scenario.onActivity { activity ->
                /**
                 * This is basically what dagger does.  It just sets your dependencies.
                 * You can do the same within your Espresso tests
                 */
                activity.user = User(null)
            }
        }

    }
}