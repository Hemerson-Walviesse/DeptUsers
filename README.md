# Projeto UserDep

Este é um projeto simples utilizando Spring Boot, Spring Data JPA, Maven, H2 Database, Swagger e Postman para testes.

## Configurações Iniciais

1. **Banco de Dados H2:**
   - O projeto utiliza o banco de dados H2 para armazenar informações sobre Departamentos e Usuários.
   - As configurações do banco de dados estão no arquivo `application.properties`.

2. **Executando o Projeto:**
   - Execute a aplicação Spring Boot e acesse o Swagger UI para testar os endpoints.
   - Os endpoints do Swagger estão disponíveis em: `http://localhost:8080/swagger-ui.html`

3. **Departamentos:**
   - Antes de criar usuários, é necessário criar departamentos.
   - Utilize os endpoints do Swagger para criar, listar e gerenciar departamentos.

4. **Usuários:**
   - Após criar os departamentos, você pode adicionar usuários.
   - Ao criar usuários, é necessário fornecer o ID do departamento correspondente.
   - Utilize os endpoints do Swagger para criar, listar e gerenciar usuários.

## Executando Testes com Postman

- Você pode usar o Postman para realizar testes interativos nos endpoints.
- Importe a coleção de exemplos do Postman disponível no arquivo `postman_collection.json`.

## Observações Importantes

- Certifique-se de criar os departamentos antes de adicionar usuários.
- Ao criar usuários, forneça o ID do departamento correspondente.

## Referências

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Maven](https://maven.apache.org/)
- [Swagger](https://swagger.io/)
- [Postman](https://www.postman.com/)

Divirta-se codificando!
