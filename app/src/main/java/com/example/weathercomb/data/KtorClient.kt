package com.example.weathercomb.data

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*


object KtorClient {
     var ktorClient = HttpClient(Android) {
         install(JsonFeature){
             val json = kotlinx.serialization.json.Json {
                 ignoreUnknownKeys = true
                 isLenient = true
             }
             serializer = KotlinxSerializer(json)
         }
         install(Logging){
             logger = Logger.SIMPLE
             level = LogLevel.ALL
         }
         engine {
             socketTimeout = 50_000
             connectTimeout = 50_000
         }
    }
}