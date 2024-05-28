package com.example.project_akhir_si

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(){
    var email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Text(text = "Auto Manager" ,fontSize = 34.sp, fontWeight = FontWeight.Bold, )

        Spacer(modifier = Modifier.height(10.dp))

        Image(painterResource(id = R.drawable.login),contentDescription = "login page", modifier = Modifier.size(100.dp))
        
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Make Your Business Easier" ,fontSize = 12.sp,  textAlign = TextAlign.End)

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email address")
        })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)) {
            Text(text = "Login")

        }

        Spacer(modifier = Modifier.height(2.dp))

        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)) {
            Text(text = "Sign Up")

        }

        Spacer(modifier = Modifier.height(10.dp))
        
        Text(text = "Forgot password ?", modifier =  Modifier.clickable {  })


            
        }

        


        


}



@Preview(showBackground = true)
@Composable
fun loginPagePreview(){
    LoginPage()
}