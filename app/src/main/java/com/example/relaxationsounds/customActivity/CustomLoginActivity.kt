package com.example.relaxationsounds.customActivity

import android.view.View
import sdk.chat.core.session.ChatSDK
import sdk.chat.core.types.AccountDetails
import sdk.chat.ui.activities.LoginActivity
import sdk.chat.ui.module.UIModule

class CustomLoginActivity : LoginActivity() {
    override fun initViews() {
        super.initViews()

        // TODO:  For now disabling reset button and anonymous login
        // Will investigate and add later if needed.
        resetPasswordButton.visibility = View.GONE
        anonymousButton.visibility = View.GONE
    }
}