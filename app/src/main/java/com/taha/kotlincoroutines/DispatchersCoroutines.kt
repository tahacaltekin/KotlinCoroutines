package com.taha.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers ile coroutineleri hangi thread'te çalıştırabileceğimizi söyleyebiliyoruz.
    //Dispatchers.Default -> CPU Intensive -> cpu yoran işlemler için
    //Dispatchers.IO -> Input/ Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited Dispatcher

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name}")
        }
    }
}