package com.example.bloodbank_20bce10123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)) {
                Image(painter = painterResource (id
                = R.drawable.blood),
                    contentDescription = " " )
                Text(text = "", fontSize=30.sp,)
                Text(text = "Login", fontSize=30.sp,
                    color = Color.Black, )

                var text by remember {
                    mutableStateOf("Username")
                }
                Text(text = "", fontSize = 20.sp)
                TextField(
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    })

                var xyz by remember {
                    mutableStateOf("password")
                }
                Text(text = "", fontSize = 20.sp)
                TextField(
                    value = xyz,
                    onValueChange = { newText ->
                        text = newText
                    })
                Text(text = "", fontSize = 20.sp)

                Row() {
                    Button(onClick= {}, shape = RoundedCornerShape
                        (30.dp), colors = ButtonDefaults
                        .buttonColors(backgroundColor = Color.Red)) {
                        Text(text = "Submit",  color = Color.White)
                    }

                    Button(onClick={}, shape = RoundedCornerShape
                        (30.dp), colors = ButtonDefaults
                        .buttonColors(backgroundColor = Color.Red)) {
                        Text(text = "Clear", color = Color.White)
                    }

                }

            }
        }
    }

}




