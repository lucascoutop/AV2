# Prova Final - AV2 JWT Arquitetura Aplicação WEB
## Visão Geral
Este projeto é uma aplicação de autenticação desenvolvida em Java utilizando o framework Spring Boot e MongoDB como banco de dados. Ele fornece serviços de autenticação e gerenciamento de usuários com diferentes níveis de permissão, como ADMIN, GERENTE e USUARIO.

## Estrutura do Projeto
#### 
![image](https://github.com/lucascoutop/AV2/assets/105723795/1736e343-5f0a-46bd-b8f1-26a9be40f304)

O projeto está estruturado em diversos pacotes, cada um contendo classes com responsabilidades específicas:

- com.example.Autenticacao: Contém a classe principal para inicializar a aplicação.
- com.example.config: Configurações de segurança.
- com.example.controller: Controladores REST para autenticação e gerenciamento de usuários.
- com.example.entity: Entidades do MongoDB.
- com.example.enums: Enumerações utilizadas no projeto.
- com.example.repository: Interface para interação com o banco de dados MongoDB.
- com.example.security: Utilitários para geração e validação de tokens JWT.
- com.example.service: Serviços de autenticação e gerenciamento de usuários.


## Dependências
- Spring Boot
- Spring Security
- Spring Data MongoDB
- JWT (Json Web Token)



## Início Rápido
### Requisitos
- JDK 11+,
- Maven,

- MongoDB
- ![image](https://github.com/lucascoutop/AV2/assets/105723795/8b2a0f5d-cff1-4e5f-96ae-7412726a159c)
- ![image](https://github.com/lucascoutop/AV2/assets/105723795/aded2261-7ee1-487f-b720-b61f3a73a4e9)




## Configuração,


### SecurityConfig
- Configuração de segurança utilizando Spring Security. Define endpoints públicos e protegidos, além de configurar a autenticação básica, obedecendo a hierarquia de usuários.

### AuthController
- Controlador REST para autenticação de usuários. Possui endpoints para login, obtenção de informações do usuário e acesso restrito para administradores.

### UsuarioController
- Controlador REST para gerenciamento de usuários. Permite salvar, deletar e obter usuários.

### Usuario
- Entidade que representa um usuário no MongoDB.

### TipoConta
- Enumeração que define os tipos de conta: ADMIN, MOD e USER, algo que foi muito bem explicado durante as aulas, foi muito benéfico aprender sobre ENUNS.

### UsuarioRepository
- Interface para interação com o banco de dados MongoDB.

### JwtUtil
- Classe utilitária para geração e validação de tokens JWT.

### AuthService
- Serviço para geração e extração de informações de tokens JWT.

### UsuarioService
- Serviço para gerenciamento de usuários. Inclui operações de cadastro, deleção e consulta de usuários.

## Endpoints
### Autenticação
- POST /auth/login: Realiza o login de um usuário.
- GET /auth/user: Retorna informações do usuário autenticado.
- GET /auth/admin: Endpoint restrito para administradores.

## Gerenciamento de Usuários
### Com os ensinamentos em sala também foi possível implementar o CRUD na AV2
- POST /usuario/salvar: Salva um novo usuário.
- DELETE /usuario/deletar: Deleta um usuário.
- GET /usuario/obtemTodos: Obtém todos os usuários.
- GET /usuario/obtemUsuarioPorId: Obtém um usuário pelo ID.

## Segurança
A aplicação utiliza Spring Security para gerenciar a autenticação e autorização. As senhas são criptografadas utilizando BCrypt. Tokens JWT são usados para autenticação de sessões.
