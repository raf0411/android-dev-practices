package kalbe.corp.aichatbottutorial

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.create

object NetworkModule {
    @OptIn(ExperimentalSerializationApi::class)
    private val retrofit = Retrofit.Builder()
        .baseUrl("YOUR_LOCAL_IP_ADDRESS:3000/") // ex) http://192.115.12.248:3000
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .build()
    val aiService = retrofit.create<AiService>()
}