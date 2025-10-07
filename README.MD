# ⛽ Sistema de Posto de Gasolina

API REST desenvolvida em **Java com Spring Boot** para o gerenciamento de um posto de gasolina.  
O sistema permite **registrar combustíveis, controlar estoque, registrar vendas e calcular valores totais** de forma automatizada.  

Projeto criado com o objetivo de **aprimorar conhecimentos em lógica de negócio, JPA/Hibernate, persistência de dados e boas práticas com Spring Boot**.

---

## 🚀 Funcionalidades

- Cadastro e gerenciamento de combustíveis (tipo, preço por litro e estoque)
- Registro de vendas com cálculo automático do valor total
- Atualização automática do estoque após cada venda
- Persistência de dados com PostgreSQL
- Estrutura baseada no padrão MVC (Controller, Service, Repository, Entity)
- Configuração de banco de dados via `application.properties`

---

## 🧠 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA / Hibernate**
- **PostgreSQL**
- **Maven**
- **Jakarta Persistence**
- **Lombok** *(opcional, se for usar para reduzir boilerplate)*

---

## 🗂️ Estrutura do Projeto

sistema-posto-gasolina/
├── src/
│ ├── main/
│ │ ├── java/com/sistemadepostodegasolina/demo/
│ │ │ ├── controller/ # Controladores REST
│ │ │ ├── dto/ # Objetos de transferência de dados
│ │ │ ├── entity/ # Entidades (Fuel, FuelSales, ProductStore)
│ │ │ ├── repository/ # Interfaces JPA
│ │ │ ├── service/ # Regras de negócio
│ │ │ └── DemoApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ ├── templates/
│ │ └── application.properties
├── pom.xml
└── README.md


---

## ⚙️ Configuração do Banco de Dados

Crie um banco no PostgreSQL com o nome `posto_gasolina` e adicione suas credenciais no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/posto_gasolina
spring.datasource.username=postgres
spring.datasource.password=sua_senha_aqui

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
▶️ Como executar o projeto
Clone o repositório:


git clone https://github.com/CezinhaDev/sistema-posto-gasolina.git
Entre na pasta do projeto:


cd sistema-posto-gasolina
Instale as dependências com o Maven:


mvn clean install
Execute a aplicação:

bash
Copiar código
mvn spring-boot:run
A API será iniciada em:
👉 http://localhost:8080

🧩 Endpoints principais (exemplo)
Método	Endpoint	Descrição
GET	/combustiveis	Lista todos os combustíveis
POST	/combustiveis	Cadastra um novo combustível
POST	/vendas	Registra uma venda e atualiza o estoque
GET	/vendas	Lista todas as vendas realizadas

📘 Conceitos praticados
Injeção de dependência (@Autowired)

Lógica de negócio em camadas (@Service)

Criação e mapeamento de entidades com JPA (@Entity, @Table, @Id)

Relacionamentos entre entidades (@ManyToOne, @OneToMany)

Persistência e consultas com JpaRepository

Boas práticas com Clean Code e padrões RESTful

🧑‍💻 Autor
César Henrique
💼 Desenvolvedor Web & Suporte Técnico
📎 GitHub
📎 LinkedIn

