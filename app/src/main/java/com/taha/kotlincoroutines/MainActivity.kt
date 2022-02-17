package com.taha.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        /*
        GlobalScope.launch {
            repeat(1000000) {
                launch {
                    println("android")
                }
            }
        }
         */

        //Scope - Coroutine'in nerede çalıştırılacağını belirler. Yaşam döngüsünü belirleyen yapı.
        //Global Scope - Bütün uygulamada çalıştırabileceğimiz kapsamda çalışır.
        //RunBlocking - Bloklayarak scope oluşturur.
        //CoroutineScope - İçerisinde ki bütün coroutineler bitene kadar çalışır.

        /*
        //RunBlocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")
        */

        /*
        //Global Scope
        println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("Global scope end")

         */


        //CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")



    }
}