package com.timothypaetz.android.androidtesttricks

import android.os.Bundle
import android.widget.TextView
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity

/**
 * Not actually wiring up Dagger/Hilt for such a small project
 * Commenting it out just to show the example
 */
// @AndroidEntryPoint
open class Trick3Activity : AppCompatActivity() {

    /**
     * Commented out to show the example
     */
    // @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trick3)
        user = User("Timothy Paetz") // Only added to get test to run.  This would actually be injected

        initUserName()
    }

    @VisibleForTesting
    fun initUserName() {
        // Same logic as Trick1Activity except user dependency is injected
        if (hasCompletedProfile()) {
            findViewById<TextView>(R.id.name).text = user.name
        } else {
            findViewById<TextView>(R.id.name).text = getString(R.string.incomplete_profile)
        }
    }

    @VisibleForTesting
    fun hasCompletedProfile(): Boolean {
        return user.name != null
    }

}