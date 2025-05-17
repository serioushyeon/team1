package com.sopt.at.sopkathon.team1.data.service

import com.sopt.at.sopkathon.team1.data.dto.base.DummyBaseResponse
import com.sopt.at.sopkathon.team1.data.dto.request.DummyServiceRequest
import com.sopt.at.sopkathon.team1.data.dto.response.DummyServiceResponse
import retrofit2.http.Body
import retrofit2.http.GET

interface Team1Service {

    @GET("/aip/v1/servie")
    suspend fun getServiceData(
        @Body request: DummyServiceRequest
    ): DummyBaseResponse<DummyServiceResponse>

}