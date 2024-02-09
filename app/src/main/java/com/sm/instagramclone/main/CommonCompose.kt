package com.sm.instagramclone.main

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.sm.instagramclone.IgViewModel

@Composable
fun NotificationMessage(viewModel: IgViewModel){
    val notifyState = viewModel.popUpNotification.value
    val notifyMessage = notifyState?.getContentOrNull()
    if (notifyMessage != null){
        Toast.makeText(LocalContext.current, notifyMessage, Toast.LENGTH_LONG).show()
    }
}