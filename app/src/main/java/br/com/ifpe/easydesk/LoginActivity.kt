package br.com.ifpe.easydesk

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import br.com.ifpe.easydesk.ui.theme.Black

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPage()
        }
    }
}

@Composable
fun LoginPage() {
    val context = LocalContext.current

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Black
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = CenterHorizontally,
        ) {
            EasyDeskLogo()
            Text(
                text = "Bem vindo ao App",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Aplicativo para reservar cadeiras no ambiente corporativo",
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF9B9B9B)
            )
            Button(onClick = {
                val intent = Intent(context, HomePage::class.java)
                context.startActivity(intent)
            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "Entrar com Google",
                    color = Color.White,
                    fontSize = 14.sp)
            }
        }
    }
}


@Composable
fun EasyDeskLogo() {
    val koulenFont = FontFamily(Font(R.font.koulen))

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.easy),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = "Easy Desk",
            fontSize = 45.sp,
            fontFamily = koulenFont,
            color = Color.White
        )
    }
}
