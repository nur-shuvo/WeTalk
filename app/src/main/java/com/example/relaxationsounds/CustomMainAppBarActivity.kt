package com.example.relaxationsounds

import android.content.Intent
import android.widget.Toast
import sdk.chat.ui.activities.MainAppBarActivity

private const val EXIT_APP_DURATION = 2000

class CustomMainAppBarActivity : MainAppBarActivity() {

    private var lastBackPresTime : Long = 0

    override fun onBackPressed() {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastBackPresTime < EXIT_APP_DURATION) {
            finishAffinity()
        } else {
            Toast.makeText(this, "Back press again to exit", Toast.LENGTH_SHORT).show()
            lastBackPresTime = currentTime
        }
    }
}