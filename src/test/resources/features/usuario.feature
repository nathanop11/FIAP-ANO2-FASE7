# language: pt
Funcionalidade: Registro de usuarios
  Como um administrador do sistema
  Eu quero permitir o registro de usuarios
  Para que eles possam acessar as funcionalidades

  Cenario: Registro com dados validos
    Dado o sistema está disponivel
    Quando eu envio uma requisicao POST para "/api/usuarios" com nome "João" e email "joao@email.com"
    Então eu recebo um status code 200

  Cenario: Registro com email invalido
    Dado o sistema esta disponivel
    Quando eu envio uma requisicao POST para "/api/usuarios" com nome "Maria" e email "mariaemail.com"
    Então eu recebo um status code 400

  Cenario: Verificar o status da API
    Dado o sistema está disponivel
    Quando eu faço uma requisicao GET para "/api/usuarios/status"
    Então eu recebo um status code 200