package com.timothypaetz.android.testtricks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Not actually wiring up Dagger/Hilt for such a small project
 * Commenting it out just to show the example
 */
// @AndroidEntryPoint
class Trick3Activity : AppCompatActivity() {

    /**
     * Commented out to show the example
     */
    // @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trick3)

    }

}