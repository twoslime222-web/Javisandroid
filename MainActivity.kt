package com.rn.jarvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF07111F)
private val Panel = Color(0xFF101F32)
private val Accent = Color(0xFF43D9E6)
private val Muted = Color(0xFF9BB0C5)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                JarvisHome()
            }
        }
    }
}

@Composable
private fun JarvisHome() {
    Surface(modifier = Modifier.fillMaxSize(), color = Background) {
        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Column {
                Text("J.A.R.V.I.S.", color = Accent, fontSize = 27.sp, fontWeight = FontWeight.Bold)
                Text("ASSISTENTE PESSOAL", color = Muted, fontSize = 11.sp, letterSpacing = 2.sp)
            }

            Card(
                modifier = Modifier.fillMaxWidth().weight(1f),
                colors = CardDefaults.cardColors(containerColor = Panel),
                shape = RoundedCornerShape(24.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.Place, contentDescription = null, tint = Accent, modifier = Modifier.size(42.dp))
                        Spacer(Modifier.height(10.dp))
                        Text("MAPA", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
                        Text("O mapa interativo será conectado nesta área.", color = Muted, fontSize = 12.sp)
                    }
                }
            }

            Button(
                onClick = { /* Próxima etapa: conectar reconhecimento e resposta por voz. */ },
                modifier = Modifier.fillMaxWidth().height(62.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Background)
            ) {
                Icon(Icons.Default.Mic, contentDescription = null)
                Text("  FALAR COM JARVIS", fontWeight = FontWeight.Bold)
            }

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Panel),
                shape = RoundedCornerShape(18.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Memory, contentDescription = null, tint = Accent)
                    Column(modifier = Modifier.padding(start = 12.dp)) {
                        Text("MEMÓRIA", color = Color.White, fontWeight = FontWeight.SemiBold)
                        Text("Histórico e lembranças serão implementados aqui.", color = Muted, fontSize = 12.sp)
                    }
                }
            }
            Text("Versão inicial • 0.1.0", color = Muted, fontSize = 11.sp)
        }
    }
}
