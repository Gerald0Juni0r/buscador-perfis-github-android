package com.example.githubperfis.model // Pacote do modelo

// Conjunto de dados -> 'GithubUser()'
data class GithubUser ( // Classe de dados do usuário no Github
    val login: String, // Nome de usuário
    val name: String?, // Nome real do usuário -> pode ser nulo?
    val avatar_url: String, // URL da foto de perfil
    val public_repos: Int, // Quantidade de repo. públicos
    val followers: Int, // Quantidade de seguidores
    val following: Int // Quantidade de usuários que está seguindo
)

