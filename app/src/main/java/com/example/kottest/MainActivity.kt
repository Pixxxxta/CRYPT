package com.example.kottest

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kottest.ui.theme.KotTestTheme
import okhttp3.*
import org.json.JSONArray
import java.io.IOException

class MainActivity : ComponentActivity() {
    private val client = OkHttpClient()
    private var ok: String = "5"
    private var coins: String = "BTC XRP ETH BNB ANC"
    private var  coin: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column() {
                Column(modifier = Modifier
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

                    val text =  remember { mutableStateOf("") }
                    TextField(value = text.value, onValueChange = {text.value = it}, label = {Text(text="Введите криптовалюту")})
                    if (text.value == "BTC"){
                        val image: Painter = painterResource(id = R.drawable.btc)
                        Image(painter = image, contentDescription = "")
                        coin = text.value
                        if (coin in coins) {
                            val request = Request.Builder()
                                .url("https://min-api.cryptocompare.com/data/pricemulti?fsyms="+coin+"&tsyms=USD&api_key=77f24cceae211b0262eaabf51a399875fc891ca3140cc8c086a6558d3fcf7e97")
                                .build()

                            client.newCall(request).enqueue(object : Callback {
                                override fun onFailure(call: Call, e: IOException) {}
                                override fun onResponse(call: Call, response: Response) {
                                    ok = response.body()?.string().toString()
                                    // Я ПРОСТО У СТРОКИ ОБРЕЗАЮ ВСЁ НЕНУЖНОЕ
                                    ok = ok.substringAfter("USD").substringBefore("}}").substring(2)
                                    println(ok.toFloatOrNull())


                                }
                            })

                            Thread.sleep(1000)
                            Text(text = "$ok USD")



                        }
                    }
                    if (text.value == "XRP"){
                        val image: Painter = painterResource(id = R.drawable.xrp)
                        Image(painter = image, contentDescription = "")
                        coin = text.value
                        if (coin in coins) {
                            val request = Request.Builder()
                                .url("https://min-api.cryptocompare.com/data/pricemulti?fsyms="+coin+"&tsyms=USD&api_key=77f24cceae211b0262eaabf51a399875fc891ca3140cc8c086a6558d3fcf7e97")
                                .build()

                            client.newCall(request).enqueue(object : Callback {
                                override fun onFailure(call: Call, e: IOException) {}
                                override fun onResponse(call: Call, response: Response) {
                                    ok = response.body()?.string().toString()
                                    // Я ПРОСТО У СТРОКИ ОБРЕЗАЮ ВСЁ НЕНУЖНОЕ
                                    ok = ok.substringAfter("USD").substringBefore("}}").substring(2)
                                    println(ok.toFloatOrNull())


                                }
                            })

                            Thread.sleep(1000)
                            Text(text = "$ok USD")



                        }
                    }
                    if (text.value == "BNB"){
                        val image: Painter = painterResource(id = R.drawable.bnb)
                        Image(painter = image, contentDescription = "")
                        coin = text.value
                        if (coin in coins) {
                            val request = Request.Builder()
                                .url("https://min-api.cryptocompare.com/data/pricemulti?fsyms="+coin+"&tsyms=USD&api_key=77f24cceae211b0262eaabf51a399875fc891ca3140cc8c086a6558d3fcf7e97")
                                .build()

                            client.newCall(request).enqueue(object : Callback {
                                override fun onFailure(call: Call, e: IOException) {}
                                override fun onResponse(call: Call, response: Response) {
                                    ok = response.body()?.string().toString()
                                    // Я ПРОСТО У СТРОКИ ОБРЕЗАЮ ВСЁ НЕНУЖНОЕ
                                    ok = ok.substringAfter("USD").substringBefore("}}").substring(2)
                                    println(ok.toFloatOrNull())


                                }
                            })

                            Thread.sleep(1000)
                            Text(text = "$ok USD")



                        }
                    }
                    if (text.value == "ETH"){
                        val image: Painter = painterResource(id = R.drawable.eth)
                        Image(painter = image, contentDescription = "")
                        coin = text.value
                        if (coin in coins) {
                            val request = Request.Builder()
                                .url("https://min-api.cryptocompare.com/data/pricemulti?fsyms="+coin+"&tsyms=USD&api_key=77f24cceae211b0262eaabf51a399875fc891ca3140cc8c086a6558d3fcf7e97")
                                .build()

                            client.newCall(request).enqueue(object : Callback {
                                override fun onFailure(call: Call, e: IOException) {}
                                override fun onResponse(call: Call, response: Response) {
                                    ok = response.body()?.string().toString()
                                    // Я ПРОСТО У СТРОКИ ОБРЕЗАЮ ВСЁ НЕНУЖНОЕ
                                    ok = ok.substringAfter("USD").substringBefore("}}").substring(2)
                                    println(ok.toFloatOrNull())


                                }
                            })

                            Thread.sleep(1000)
                            Text(text = "$ok USD")



                        }
                    }

                    if (text.value == "ANC"){
                        val image: Painter = painterResource(id = R.drawable.anc)
                        Image(painter = image, contentDescription = "")
                        coin = text.value
                        if (coin in coins) {
                            val request = Request.Builder()
                                .url("https://min-api.cryptocompare.com/data/pricemulti?fsyms="+coin+"&tsyms=USD&api_key=77f24cceae211b0262eaabf51a399875fc891ca3140cc8c086a6558d3fcf7e97")
                                .build()

                            client.newCall(request).enqueue(object : Callback {
                                override fun onFailure(call: Call, e: IOException) {}
                                override fun onResponse(call: Call, response: Response) {
                                    ok = response.body()?.string().toString()
                                    // Я ПРОСТО У СТРОКИ ОБРЕЗАЮ ВСЁ НЕНУЖНОЕ
                                    ok = ok.substringAfter("USD").substringBefore("}}").substring(2)
                                    println(ok.toFloatOrNull())


                                }
                            })

                            Thread.sleep(1000)
                            Text(text = "$ok USD")



                        }
                    }





                }
            }

        }
    }

}
@Preview (showBackground = true)
@Composable
fun Text1(){
    Text(text="Hello nigger")

}

@Composable
fun Vvod(){
    Column() {
        val text =  remember { mutableStateOf("") }
        TextField(value = text.value, onValueChange = {text.value = it}, label = {Text(text="Введите криптовалюту")})
        Text(text.value)

    }



    }

@Composable
fun img() {
    val image: Painter = painterResource(id = R.drawable.btc)
    Image(painter = image,contentDescription = "")
}

