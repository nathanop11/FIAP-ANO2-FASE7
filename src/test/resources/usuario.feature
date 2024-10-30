# language: pt
@registro_usuarios
Funcionalidade: Registro de usuários
  Como um administrador do sistema
  Eu quero permitir o registro de usuários
  Para que eles possam acessar as funcionalidades

  @valido
  Cenário: Registro com dados válidos
    Dado o sistema está disponível
    Quando eu envio uma requisição POST para "/api/usuarios" com nome "João" e email "joao@email.com"
    Então eu recebo um status code 200

  @invalido
  Cenário: Registro com email inválido
    Dado o sistema está disponível
    Quando eu envio uma requisição POST para "/api/usuarios" com nome "Maria" e email "mariaemail.com"
    Então eu recebo um status code 400

  @status_api
  Cenário: Verificar o status da API
    Dado o sistema está disponível
    Quando eu faço uma requisição GET para "/api/usuarios/status"
    Então eu recebo um status code 200
