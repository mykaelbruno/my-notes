# 📝 My Notes — Aplicação Web de Anotações

Projeto pessoal de uma aplicação web de anotações desenvolvida com o objetivo de **aprimorar habilidades em desenvolvimento web utilizando Spring Boot e Thymeleaf**.

O projeto foca na prática de conceitos fundamentais do ecossistema Spring, combinando **renderização server-side** com **APIs REST**, seguindo o padrão **MVC**.

---

🔌 API REST e Plataforma Web

Este projeto foi desenvolvido de forma híbrida, possuindo duas formas de interação com o backend, ambas reutilizando a mesma camada de serviço:

📡 API REST

Implementada para expor os dados no formato JSON

Permite operações como criação, listagem e busca de anotações

Ideal para consumo por outras aplicações (frontend separado, mobile, etc.)

Segue os princípios REST utilizando Spring MVC

🌐 Aplicação Web (Server-Side)

Implementada como uma plataforma web tradicional

Utiliza Thymeleaf para renderização de páginas HTML no servidor

Formulários com validação, mensagens de erro e feedback visual ao usuário

Navegação orientada a páginas

🧠 Reutilização de Lógica

Ambas as abordagens utilizam a mesma camada de Service, garantindo
- Reaproveitamento de regras de negócio
- Separação clara de responsabilidades
- Facilidade de manutenção e evolução do projeto
- Demonstração prática de como uma aplicação pode atender diferentes tipos de clientes

Essa estrutura permite que o projeto evolua facilmente para cenários mais complexos, como a adição de um frontend SPA ou integração com aplicações externas.

Abaixo um diagrama simples da estrutura que utilizei:

flowchart TD
    A[Navegador<br/>(HTML / Formulários)] --> B[Web Controller<br/>(Thymeleaf / MVC)]
    C[Cliente API<br/>(Postman / Frontend)] --> D[REST Controller<br/>(@RestController)]

    B --> E[Service<br/>(Regras de Negócio)]
    D --> E

    E --> F[Repository<br/>(Spring Data JPA)]
    F --> G[Database<br/>(H2 / Relacional)]


---

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Thymeleaf**
* **Bean Validation (Jakarta Validation)**
* **HTML / CSS**
* **Banco de dados relacional** (H2 ou outro configurável)

---

## 🎯 Objetivos do Projeto

* Praticar a **arquitetura MVC**
* Criar e consumir **APIs REST**
* Implementar **renderização server-side com Thymeleaf**
* Trabalhar com **validação de formulários**
* Implementar **tratamento de erros personalizado** (404, erros de validação, etc.)
* Separar responsabilidades entre **Controller, Service e Repository**
* Melhorar organização e estrutura de um projeto Spring Boot real

---

## ⚙️ Funcionalidades

* 📌 Criar anotações
* 📄 Listar anotações
* 🗑️ Apagar anotações
* ❌ Tratar casos de erro com exibição de mensagens de erro amigáveis ao usuário
* 🧩 Páginas HTML dinâmicas renderizadas no servidor

---

## 🧱 Arquitetura

O projeto segue o padrão **MVC (Model–View–Controller)**:

* **Model**: Entidades e regras de negócio
* **Controller**: Controle de requisições HTTP e renderização das páginas
* **Service**: Camada de lógica de negócio
* **Repository**: Persistência de dados
* **Templates**: Páginas Thymeleaf (HTML)

---

## 🛠️ Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/mykaelbruno/my-notes
   ```

2. Abra o projeto em sua IDE (IntelliJ, Eclipse, etc.)

3. Execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse no navegador:

   ```
   http://localhost:8080
   ```

---

## 📚 Aprendizados

Este projeto foi desenvolvido para meus estudos com foco em aprendizado e consolidação de conceitos, servindo como base para projetos mais complexos no futuro e como demonstração prática de conhecimentos em **Spring Boot e desenvolvimento web**.

---

## 📌 Observações

* Projeto em constante evolução
* Ideal para fins educacionais e portfólio
