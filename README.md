💰 Sistema de Controle Financeiro Pessoal

Aplicação back-end desenvolvida em Java com Spring Boot para controle de receitas, despesas e orçamento pessoal, permitindo acompanhar quanto foi recebido, quanto foi gasto e para onde o dinheiro foi direcionado.

📋 Descrição

Projeto de estudo com foco no aprendizado prático de desenvolvimento back-end, aplicando os princípios da Programação Orientada a Objetos (POO) e arquitetura em camadas (Controller → Service → Repository → Banco de Dados). O sistema permite registrar transações financeiras (receitas e despesas), classificá-las por categoria, consultar totais e saldo, e definir um orçamento mensal com limite de gastos.

🚀 Funcionalidades
 Cadastrar transação (descrição, valor, categoria, data)
 Classificar transação como RECEITA ou DESPESA
 Listar todas as transações
 Calcular total de receitas, total de despesas e saldo
 Filtrar transações por categoria
 Consultar gasto por categoria
 Consultar transações por período/mês
 Definir orçamento (limite de gasto mensal)
 Comparar gastos com o limite do orçamento
🔜 Próximos passos (evolução futura)
 Percentual gasto por categoria
 Relatório de gastos mensais
 Comparação de gastos entre meses
🛠️ Tecnologias utilizadas
Java
Spring Boot
Spring Web
Spring Data JPA
Maven — gerenciador de dependências
PostgreSQL — banco de dados relacional
API REST
Front-end (opcional/futuro): HTML, CSS e JavaScript
🧩 Modelagem
Despesa (transação)

Entidade que representa uma receita ou despesa cadastrada pelo usuário.

Descrição
Valor
Categoria
Data
Tipo (RECEITA ou DESPESA)
Orçamento

Entidade que define um limite de gasto mensal (geral, sem categoria).

id
valorLimite
mes
Fluxo
Usuário → cadastra → Despesa / Orçamento → API → PostgreSQL
📁 Estrutura do projeto
controle-financeiro-pessoal/
├── src/
│   ├── main/
│   │   ├── java/com/seuusuario/controlefinanceiro/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   ├── dto/
│   │   │   └── ControleFinanceiroApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
⚙️ Como executar o projeto
Pré-requisitos
Java instalado
Maven instalado
PostgreSQL em execução
Passos
Clone o repositório:
bash
   git clone https://github.com/seu-usuario/controle-financeiro-pessoal.git
   cd controle-financeiro-pessoal
Configure o banco de dados no arquivo src/main/resources/application.properties:
properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/controle_financeiro
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
Execute a aplicação:
bash
   mvn spring-boot:run
A API estará disponível em:
   http://localhost:8080
📡 Endpoints sugeridos
Método	Endpoint	Descrição
POST	/despesas	Cadastra uma receita ou despesa
GET	/despesas	Lista todas as transações
GET	/despesas?categoria=X	Filtra transações por categoria
GET	/despesas?mes=X	Consulta transações por período/mês
GET	/despesas/saldo	Retorna total de receitas, despesas e saldo
POST	/orcamento	Define o orçamento (limite mensal)
GET	/orcamento	Consulta o orçamento atual

Endpoints sugeridos como ponto de partida — ajuste conforme a modelagem for evoluindo.

🗺️ Roadmap
 Modelagem das entidades Despesa e Orçamento
 Implementação dos repositories (JPA)
 Implementação das regras de negócio (services)
 Implementação dos controllers e DTOs
 Cálculo de saldo, totais e gasto por categoria
 Comparação com limite do orçamento
 Percentual gasto por categoria
 Relatório mensal e comparação entre meses
 Front-end simples (HTML/CSS/JS)
👤 Autor

Desenvolvido por [Seu Nome] como projeto de estudo em back-end com Java e Spring Boot.

📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
