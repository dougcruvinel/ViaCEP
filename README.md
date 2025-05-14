Descrição em Português:
Este programa Java realiza consultas de CEPs utilizando uma API pública e gera arquivos com os dados retornados. Ele oferece uma maneira prática de buscar informações de endereço a partir de um CEP informado, organizando os dados em um objeto e exportando-os em formato de arquivo.

Componentes principais:
Principal.java: Classe principal com o método main. Solicita um CEP ao usuário, realiza a consulta e salva os dados do endereço retornado.

ConsultaCep.java: Responsável por se comunicar com a API de CEP (provavelmente a API ViaCEP), realizando a requisição HTTP e tratando o JSON de resposta.

Endereco.java: Classe modelo (POJO) que representa um endereço, contendo atributos como logradouro, bairro, cidade, estado, etc.

GeradorDeArquivo.java: Classe utilitária que recebe um objeto Endereco e gera um arquivo (geralmente .json ou .txt) com seus dados.

Funcionalidades do programa:
Recebe um CEP via entrada do usuário.

Consulta dados de endereço completos pela internet.

Exibe os dados no console.

Salva as informações em um arquivo local.

Conceitos utilizados:
Consumo de APIs REST usando Java.

Manipulação de JSON (possivelmente usando bibliotecas como Gson).

Leitura e escrita de arquivos.

Encapsulamento e modularização com POO.

-----------------------------------------------------------------------

Description in English:
This Java program performs postal code (CEP) lookups using a public API and generates files with the returned address data. It provides a convenient way to retrieve address details from a given postal code, structure them in an object, and export them to a file.

🔍 Main Components:
Principal.java: The main class with the main method. Prompts the user for a postal code, performs the lookup, and saves the returned address data.

ConsultaCep.java: Handles communication with the postal code API (likely ViaCEP), sending HTTP requests and parsing JSON responses.

Endereco.java: A model class (POJO) representing an address, with fields like street, neighborhood, city, state, etc.

GeradorDeArquivo.java: A utility class that receives an Endereco object and writes its data to a local file (usually .json or .txt).

Program Features:
Accepts a postal code input.

Fetches full address information from the web.

Displays the information on the console.

Saves the address to a file.

Key Concepts:
REST API consumption in Java.

JSON handling (likely using libraries like Gson).

File I/O operations.

Object-oriented design and encapsulation.
