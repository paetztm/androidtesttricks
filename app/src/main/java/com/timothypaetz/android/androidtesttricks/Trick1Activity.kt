package com.timothypaetz.android.androidtesttricks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.VisibleForTesting

// Needs to be 'open' to use Mockito with this class
open class Trick1Activity : AppCompatActivity() {

    private val incompleteUser = User(null)
    private val completedUser = User("Timothy Paetz")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trick1)
        if (hasCompletedProfile(incompleteUser)) {
            toast("User has completed profile")
        } else {
            toast("User has not completed profile")
        }
    }

    @VisibleForTesting
    fun hasCompletedProfile(user: User): Boolean {
        return user.name != null
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}