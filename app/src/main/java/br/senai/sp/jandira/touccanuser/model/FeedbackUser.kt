package br.senai.sp.jandira.touccanuser.model

data class FeedbackUser(
    val avaliacoes: List<AvaliacaoUser>,
    val denuncias: List<Denuncia>,
    val quantidade_denuncias: Int = 0
)