package br.senai.sp.jandira.touccanuser.model

data class ResultCandidatos(
    val candidatos: List<Candidatos> = listOf(),
    val status_code: Int = 0
)
