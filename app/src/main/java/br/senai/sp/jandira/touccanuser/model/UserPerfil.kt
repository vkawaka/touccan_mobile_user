package br.senai.sp.jandira.touccanuser.model

data class UserPerfil(
    val id: Int = 0,
    var nome: String = "",
    val cpf: String= "",
    val telefone: String = "",
    val cep: String = "",
    val email: String = "",
    var data_nascimento: String = "",
    var senha: String = "",
    var foto: String = "",
    var biografia: String = "",
    var habilidade: String = "",
    var formacao: String = "",
    var id_disponibilidade: Int = 0
)
