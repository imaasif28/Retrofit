package com.aasif.posaasif.ui.data.api

import com.aasif.posaasif.ui.data.otp.request.OtpReq
import com.aasif.posaasif.ui.data.otp.genrateOtpResponse.GenerateOtpRes
import com.aasif.posaasif.ui.data.validateOtp.OtpVerificationRes
import com.aasif.posaasif.ui.data.validateOtp.VerifyOtpReq
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface Interface {
    @POST("Authentication.Web.Api/api/OtpAuth/GenerateOtp")
    suspend fun generateOtp(
        @Header("RequestId") requestId: String,
        @Body body: OtpReq
    ): Response<GenerateOtpRes>

    @POST("Authentication.Web.Api/api/OtpAuth/VerifyOtp")
    suspend fun validateOtp(
        @Header("RequestId") requestId: String,
        @Body body: VerifyOtpReq
    ): Response<OtpVerificationRes>
}
