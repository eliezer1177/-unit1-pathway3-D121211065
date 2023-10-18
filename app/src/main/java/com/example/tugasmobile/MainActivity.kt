package com.example.tugasmobile

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasmobile.ui.theme.TugasMobileTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box {
                    Image(
                        modifier = Modifier
                            .size(150.dp),
                        painter = painterResource(id = R.drawable.kucing),
                        contentDescription = "Foto Profil",
                        alignment = Alignment.Center
                    )
                }
                    Spacer(modifier = Modifier.height(8.dp))

                Box {

                    Text(
                        text = "Nama: Eliezer Renden",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                    )
                }
                    Text(
                        text = "NIM: D121211065",
                        fontSize = 12.sp

                    )
                    Spacer(modifier = Modifier.height(16.dp))

                Box {


                    Row {
                        Icon(
                            Icons.Rounded.Call,
                            contentDescription = "Contact",
                            modifier = Modifier.size(15.dp)
                        )
                        BasicText(
                            text = " 08123xxxxxxxx"
                        )
                    }
                }
                Box {


                    Row {
                        Icon(
                            Icons.Rounded.Email,
                            contentDescription = "Email",
                            modifier = Modifier
                                .size(15.dp)
                        )
                        BasicText(
                            text = " eliezer@example.com",
                            style = TextStyle(fontSize = 15.sp)
                        )
                    }
                }

                }


        }
        }
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box {
            Image(
                modifier = Modifier
                    .size(150.dp),
                painter = painterResource(id = R.drawable.kucing),
                contentDescription = "Foto Profil",
                alignment = Alignment.Center
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        Box {

            Text(
                text = "Nama: Eliezer Renden",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
            )
        }
        Text(
            text = "NIM: D121211065",
            fontSize = 12.sp

        )
        Spacer(modifier = Modifier.height(16.dp))

        Box {


            Row {
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = "Contact",
                    modifier = Modifier.size(15.dp)
                )
                BasicText(
                    text = " 08123xxxxxxxx"
                )
            }
        }
        Box {


            Row {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "Email",
                    modifier = Modifier
                        .size(15.dp)
                )
                BasicText(
                    text = " eliezer@example.com",
                    style = TextStyle(fontSize = 15.sp)
                )
            }
        }

    }
    
}