# ame1PEt

Site de adoção de animais com recomendação inteligente, mapa de ONGs, doações, cadastro de usuários e ONGs — feito em **Java (Spring)** + **Angular** + **Postgres**, com integração de APIs de Inteligência Artificial.

> **Stack**: Java (Spring Boot) + Angular + Postgres + APIs de IA (recomendações, análise de perfil, moderação de conteúdo) + Google Maps API.  
> **Plataformas**: web responsivo (desktop e mobile).

---

## ✨ Funcionalidades

- **Catálogo de animais disponíveis**
    - Lista com fotos, filtros por espécie/porte/localização, busca inteligente por IA.
    - Perfil detalhado de cada animal (histórico, temperamento, vacinas).
    - Recomendações personalizadas de animais (IA).

- **Cadastro/Login de usuários**
    - Cadastro de adotantes e ONGs/protetores.
    - Login seguro (Spring Security + JWT).
    - Painéis personalizados para cada tipo (adotante, ONG, admin).

- **Cadastro e aprovação de ONGs**
    - ONGs/protetores enviam documentação para cadastro.
    - Admin aprova ou reprova ONGs antes de ativação.

- **Formulário de interesse/adoção**
    - Adotante solicita adoção, responde perguntas, envia documentos.
    - IA analisa perfil para sugerir animais compatíveis.

- **Doações**
    - Doação financeira via integração com plataformas de pagamento.
    - Doação de itens (ração, brinquedos, medicamentos).
    - Campanhas específicas por animal/ONG.
    - Doações recorrentes e reconhecimento de doadores.

- **Mapa interativo**
    - Google Maps exibe ONGs, animais e eventos próximos.
    - Busca por proximidade e rotas até local do animal/ONG.
    - Cadastro de endereço via mapa.

- **Chat e mensagens**
    - Comunicação entre adotantes e ONGs/protetores.
    - Respostas automáticas via IA para dúvidas frequentes.

- **Blog e conteúdo educativo**
    - Dicas, informações sobre adoção responsável, cuidados.
    - Sugestões de leitura via IA conforme perfil/interesse.

- **Sistema de avaliação/feedback**
    - Avaliação de ONGs/adotantes, moderação por IA.

---

## 🗂 Estrutura do projeto

```
backend/
├─ src/main/java/
│  ├─ model/                # Entidades: Adotante, ONG, Admin, Animal, Doação
│  ├─ repository/           # Repositórios JPA
│  ├─ controller/           # Endpoints REST: cadastro, login, adoção, doação, mapas
│  ├─ service/              # Lógica de negócio, integração IA, Google Maps
│  └─ security/             # Spring Security, JWT, roles
frontend/
├─ src/app/
│  ├─ pages/
│  │  ├─ home/              # Catálogo de animais, filtros, recomendações
│  │  ├─ animal-detail/     # Perfil do animal
│  │  ├─ login/             # Login/cadastro de usuários
│  │  ├─ dashboard/         # Painel para cada tipo de usuário
│  │  ├─ adoption-form/     # Solicitação de adoção
│  │  ├─ donation/          # Doações financeiras/itens
│  │  ├─ map/               # Integração Google Maps
│  │  ├─ chat/              # Mensagens entre usuários e ONGs
│  │  ├─ blog/              # Conteúdo educativo
│  │  └─ admin/             # Aprovação de ONGs, gestão do sistema
│  └─ shared/               # Componentes reutilizáveis, serviços de autenticação
```

> Os caminhos e nomes refletem a organização sugerida para backend e frontend.

---

## 🧠 Arquitetura

- **Backend RESTful com Spring Boot**: entidades, repositórios, controllers, serviços, autenticação e autorização com JWT.
- **Frontend Angular**: SPA responsiva, rotas protegidas por tipo de usuário, integração com backend via HTTP.
- **Banco de dados Postgres**: persistência dos usuários, animais, doações, ONGs.
- **APIs de IA**: recomendações, análise de perfil, moderação de conteúdo.
- **Google Maps API**: exibição de ONGs, animais, eventos, cadastro de endereço.

---

## 🗺️ Mapa e GPS

- **Google Maps** integrado: exibe localização de ONGs, animais e eventos.
- Busca por proximidade do usuário.
- Cadastro de endereço via mapa.
- Rotas até o local do animal/ONG.

---

## 💰 Doações

- Doação financeira e de itens, com metas e campanhas.
- Integração com gateways de pagamento (ex: Paypal, Pix).
- Histórico de doações por usuário.
- Reconhecimento público de doadores.

---

## 🤖 Integração com Inteligência Artificial (IA)

O amePEts integra APIs de IA para:
- Recomendação inteligente de animais para adoção conforme perfil do usuário.
- Moderação automática de fotos e textos enviados.
- Análise de perfil de adotante para segurança e compatibilidade.
- Chatbot para dúvidas frequentes e suporte.
- Detecção automática de raça/porte em fotos de animais.
- Prevenção de fraudes e padrões suspeitos em cadastros/doações.

A IA é integrada via serviços REST externos (Google Vision, OpenAI, IBM, AWS, Azure etc) e módulos próprios, tornando a experiência mais segura, personalizada e automatizada.
---

## 📱 Telas

- **Home**  
  Catálogo de animais, filtros, recomendações IA, ações rápidas (adotar, doar, ver detalhes).

- **Perfil do animal**  
  Fotos, histórico, vacinas, compatibilidade com adotante (IA).

- **Cadastro/Login**  
  Formulários para adotantes, ONGs, admin; fluxo de aprovação para ONGs.

- **Painéis (Dashboard)**  
  Adotante: perfil e histórico; ONG: cadastro e gerência de animais; Admin: gestão de ONGs e sistema.

- **Mapa**  
  ONGs, animais, eventos, busca por proximidade e rotas.

- **Doação**  
  Página para doar dinheiro/itens, acompanhar campanhas e histórico.

- **Chat/Mensagens**  
  Comunicação entre adotante e ONG, suporte IA.

- **Blog/Conteúdo**  
  Artigos, dicas, informações educativas.

---

## ⚙️ Como rodar

1. **Backend (Spring Boot)**
   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```
2. **Frontend (Angular)**
   ```bash
   cd frontend
   npm install
   ng serve
   ```
3. **Banco de dados**
    - Postgres configurado conforme `application.properties` do backend.

4. **Configurar APIs externas**
    - Chaves do Google Maps na aplicação Angular.
    - Configurar endpoints das APIs de IA e gateways de pagamento conforme documentação.

---

## 🔧 Manutenção

- Painéis permitem edição de dados e histórico.
- Admin pode aprovar/reprovar ONGs.
- Rotas e permissões controladas por tipo de usuário (Spring Security + Angular Guards).
- Documentação das APIs disponível para integração e expansão.

---

## 📌 Possíveis futuras implementações

- Suporte a novos tipos de usuários (voluntários, veterinários).
- Analytics de adoções e doações.
- Backup/restore de dados.
- App mobile nativo.
- Relatórios avançados e BI.
- Testes automatizados (backend e frontend).

---


## ✍️ Créditos

- Desenvolvimento: **Thiago Ferreira da Silva**.
- E-mail: thiago.fsilva2@ufape.edu.br