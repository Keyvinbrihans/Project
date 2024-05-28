package com.example.project_akhir_si

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupPage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Sign Up", fontSize = 34.sp, fontWeight = FontWeight.Bold,)

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Nama")
        })

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email")
        })

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Re password")
        })
        Spacer(modifier = Modifier.height(8.dp))


        Text(text = "Already have account ?")
        Spacer(modifier = Modifier.height(24.dp))
        
        Button(onClick = { /*TODO*/}, colors = ButtonDefaults.buttonColors(Color.Blue) ) {
            Text(text = "Sign Up")
            
        }


    }
}

@Preview(showBackground = true)
@Composable
fun SignupPagePreview(){
    SignupPage()
}









