# Projeto API Simples com Testes
Este projeto é uma API em Java com testes automatizados escritos em BDD, utilizando Cucumber e RestAssured. O objetivo dos testes é garantir a funcionalidade correta da API, validando diferentes cenários de comportamento e comunicação entre os serviços.

Estrutura do Projeto
O projeto inclui:

Três cenários de teste BDD escritos em Gherkin para validar as principais funcionalidades, incluindo:
- Cenários de sucesso (caminhos felizes).
- Cenários de falhas (validação de erros).

#### Testes de API para verificar:

- Status code das respostas.
- Corpo de resposta JSON.
- Contrato de resposta, validando a estrutura JSON com JSON Schema.

### Executando os Testes

Para rodar os testes, siga estas etapas:

Inicializar o projeto: Garanta que as dependências estão instaladas e que o projeto está inicializado corretamente. Isso pode ser feito pela linha de comando ou pela sua IDE preferida, como o IntelliJ.

Navegar para o diretório de testes: No terminal, acesse o diretório onde os cenários de teste estão localizados:

Copiar código
` cd api-simples-com-testes/api-simples/src/test/resources

## **Executar o cenário de teste:**
   Rode o teste `usuario.feature` para verificar o comportamento das funcionalidades:

## Requisitos

- **Java** e **Maven** para gerenciamento de dependências.
- **Cucumber** e **RestAssured** para execução e validação de testes.

> Observação: Os testes foram configurados para rodar localmente, mas o projeto pode ser adaptado para integração em um pipeline CI/CD (ex.: GitHub Actions, Azure DevOps).

## Estrutura de Cenários

Os cenários de teste escritos em Gherkin estão localizados em `usuario.feature`. Cada cenário cobre casos de uso típicos da API e valida a interação do sistema de forma detalhada, proporcionando segurança na execução dos testes e cobertura de funcionalidades.

--- 

Este README ajuda a guiar o usuário na execução dos testes e oferece uma visão geral do que