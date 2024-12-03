Gerador de CPF e CNPJ com Spring Boot com Thymeleaf
---------------------------------------------------
Este projeto implementa a mesma funcionalidade do gerador de CPF e CNPJ, mas agora em um ambiente Spring Boot com interface web usando Thymeleaf e layout
responsivo. A lógica do gerador de documentos foi mantida, adaptando-se à arquitetura MVC do Spring.

Estrutura do Projeto
--------------------
Pacotes
-------
com.javaricci.GeracaoCPFCNPJ
Contém a classe principal da aplicação (GeradorApplication).

com.javaricci.GeracaoCPFCNPJ.Service
Contém os serviços para geração de CPF e CNPJ (GeradorService).

com.javaricci.GeracaoCPFCNPJ.Controller
Contém o controlador responsável pelas rotas (GeradorController).

src/main/resources/templates
Contém os arquivos HTML Thymeleaf.

Layout Responsivo
Utilizei o Bootstrap para criar um layout responsivo:

Botões "Gerar CPF" e "Gerar CNPJ" são grandes e centralizados.
A área de texto é responsiva, redimensionando-se adequadamente em dispositivos móveis.

Como Executar
-------------
Clone o projeto ou copie os arquivos para seu ambiente local.
Certifique-se de ter o Java 11+ e o Maven instalados.

Abra o navegador e acesse http://localhost:8080.

Resultados Esperados
--------------------
Clicar em "Gerar CPF" exibe um CPF válido no campo de texto.
Clicar em "Gerar CNPJ" exibe um CNPJ válido no campo de texto.
Com essa refatoração, o sistema agora está adaptado para a web, oferecendo uma interface moderna e responsiva.
