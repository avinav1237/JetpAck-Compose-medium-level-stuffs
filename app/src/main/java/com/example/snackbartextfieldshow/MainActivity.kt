package com.example.snackbartextfieldshow

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.snackbartextfieldshow.ui.theme.SnackBarTextFieldShowTheme
import kotlinx.coroutines.launch
import androidx.compose.material.Text as Text1

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            val scaffoldState = rememberScaffoldState()
//            var textFieldState by  remember {
//                mutableStateOf("")
//            }
//            val scope = rememberCoroutineScope()
//            Scaffold(
//                modifier = Modifier
//                    .fillMaxSize(),
//                scaffoldState = scaffoldState
//            ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 30.dp)
//                ) {
//                    OutlinedTextField(
//                        value = textFieldState,
//                        label = {
//                            Text1(text = "Enter your name")
//                        },
//                        onValueChange = {
//                            textFieldState = it
//                        },
//                        siungleLine = true,
//                        modifier = Modifier.fillMaxWidth(),
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        scope.launch {
//                            scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
//                        }
//                    }) {
//                        Text1(text = "pls greet me")
//                    }
//                }
//
//            }
//        }
    }
}