package com.timothypaetz.android.androidtesttricks

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
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
                activity.initUserName()
            }
            onView(withId(R.id.name)).check(matches(withText(R.string.incomplete_profile)))
        }

    }

    @Test
    fun testInjectedNamedUserIsDisplayed() {
        launchActivity<Trick3Activity>().use { scenario ->
            scenario.onActivity { activity ->
                /**
                 * This is basically what dagger does.  It just sets your dependencies.
                 * You can do the same within your Espresso tests
                 */
                activity.user = User("Hello World")
                activity.initUserName()
            }
            onView(withId(R.id.name)).check(matches(withText("Hello World")))
        }

    }
}