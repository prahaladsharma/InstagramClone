package com.sm.instagramclone.main

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
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

@Composable
fun CommonProgressSpinner(){
    Row(
        modifier = Modifier
            .alpha(0.5f)
            .background(Color.LightGray)
            .clickable { }
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CircularProgressIndicator()
    }
}