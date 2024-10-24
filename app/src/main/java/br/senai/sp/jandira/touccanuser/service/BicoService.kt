package br.senai.sp.jandira.touccanuser.service

import br.senai.sp.jandira.touccanuser.model.Candidato
import br.senai.sp.jandira.touccanuser.model.Login
import br.senai.sp.jandira.touccanuser.model.LoginResult
import br.senai.sp.jandira.touccanuser.model.ResultBico
import br.senai.sp.jandira.touccanuser.model.ResultBicos
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface BicoService {

    @GET("bico")
    fun getAllBicos(): Call<ResultBicos>

    @GET("bico/{id}")
    fun getBicoById(@Path("id") id:Int): Call<ResultBico>

    @Headers("Content-Type: application/json")
    @POST("candidato")
    fun postCandidato(@Body user: Candidato): Call<Candidato>

}