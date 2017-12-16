package com.taurus.repository.remote

import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response

class RequestInterceptor : Interceptor {
  override fun intercept(chain: Chain): Response {
    val originalRequest = chain.request()
    val originalHttpUrl = originalRequest.url()

    val url = originalHttpUrl.newBuilder()
        .addQueryParameter("api_key", "847f6b4e44e8451ffa91002efdee1e62")
        .build()

    val request = originalRequest.newBuilder().url(url).build()

    return chain.proceed(request)
  }
}