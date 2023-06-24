## Projeto: Tech Challenge

Ferramentas Utilizadas:

- IDE: Intellij
- Framework: Spring Boot
- Linguagem: Java 17
- Controle de versão: Git
- Plataforma de hospedagem: GitHub

## Desafios Encontrados:
Nesta primeira etapa do projeto Tech Challenge, não encontramos nenhuma dificuldade, pois já estamos familiarizados com os conceitos apresentados neste primeiro módulo.

## Documentação da API: EnderecoController
A classe EnderecoController é responsável pelo cadastro de endereços.

A URL base para acessar os endpoints desta API é: http://localhost:8080/endereco

#### Parâmetros da Solicitação

O corpo da solicitação deve ser um objeto JSON contendo as informações do endereço a ser cadastrado. O formato esperado para o objeto EnderecoDTO é o seguinte:
* `logradouro` (obrigatório): O logradouro do endereço.
* `numero` (obrigatório): O número do endereço.
* `cidade` (obrigatório): A cidade do endereço.
* `estado` (obrigatório): O estado do endereço.
* `cep` (obrigatório): O CEP (Código de Endereçamento Postal) do endereço.

#### Exemplo de Solicitação

POST /endereco HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"logradouro": "Rua Exemplo",
"numero": "123",
"bairro": "Bairro Exemplo",
"cidade": "Cidade Exemplo",
"estado": "Estado Exemplo",
"cep": "12345-678"
}

