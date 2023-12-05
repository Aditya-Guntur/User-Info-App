package com.example.appdev1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appdev1.components.DetailInfo
import com.example.appdev1.ui.theme.AppDev1Theme
import com.example.appdev1.components.HomePage
import com.example.appdev1.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
           // DetailInfo()If we write detail info here there overlapment because homepage and detailinfo is considered 2 seperate pages currently due to which they are overlapping

        }
    }
}


//           Box(modifier = Modifier.fillMaxSize()
//              .padding(20.dp)){
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(100.dp)
//
//                ){
//                    Text(text = "Hello!!!")
//
//                }

//        )        Card(
//                modifier = Modifier.background(Color.Red)
//                    .fillMaxWidth()
//                    .height(100.dp)

//            |
//            ){this
//
//                Text(text = "Hi Everyone!!")
//
//            Spacer(modifier = Modifier.width(100.dp))
//            Text(text = "Hello Aditya!!")





