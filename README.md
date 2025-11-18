https://github.com/Thiepai/GSkotlin

📱 App IMC — Kotlin + Jetpack Compose

Aplicativo Android para cálculo de IMC com navegação entre telas, autenticação simples e exibição de integrantes da equipe.

📌 Funcionalidades

O aplicativo é composto por 5 telas, todas implementadas em Jetpack Compose:

🔐 1. Tela de Login

Campos de usuário e senha

Validação obrigatória:

Usuário: admin

Senha: 123456

Em caso de erro, uma mensagem é exibida

Em caso de sucesso, redireciona para o menu

<img width="534" height="651" alt="image" src="https://github.com/user-attachments/assets/9458ff6a-d983-47cf-88ae-dc18ff70b65b" />
<img width="341" height="617" alt="image" src="https://github.com/user-attachments/assets/155e4a59-f8cd-4416-ac7b-8a2316148ec0" />


🏠 2. Tela de Menu

Apresenta três opções:

Calcular IMC → vai para a tela IMC

Equipe → mostra os integrantes

Logout → volta para o login

<img width="372" height="656" alt="image" src="https://github.com/user-attachments/assets/10b92853-f0e6-4f82-a117-0123eb37804e" />


⚖️ 3. Tela de Cálculo de IMC

Usuário insere peso e altura

O cálculo é exibido na própria tela

Botão para voltar ao Menu

Fórmula usada:

IMC = peso / (altura * altura)

<img width="430" height="615" alt="image" src="https://github.com/user-attachments/assets/cd5faa7d-26b0-42ff-aa9e-59675571f07f" />


👥 4. Tela da Equipe

Exibe a lista de integrantes, por exemplo:

Gabriel Valério – RM 552041

Thiago Ratão – RM 551351

Com botão para voltar ao Menu.

<img width="409" height="628" alt="image" src="https://github.com/user-attachments/assets/25901c80-ca53-4d40-8e78-e699c31f5009" />


🚀 5. MainActivity

Responsável por iniciar o Jetpack Compose

Contém o NavHost com todas as rotas:

login

menu

imc

equipe

🛠 Tecnologias Utilizadas

Kotlin

Jetpack Compose

Material 3

Navigation Compose

SDK mínima: 24

Compile SDK: 35

📂 Estrutura dos Arquivos
app/
 └── src/main/java/com/github/thiepai/gskotlin/
      ├── MainActivity.kt
      ├── LoginScreen.kt
      ├── MenuScreen.kt
      ├── ImcScreen.kt
      └── TeamScreen.kt


Apenas 5 arquivos, conforme solicitado.

▶️ Como Rodar o Projeto

Abra o projeto no Android Studio

Aguarde sincronizar o Gradle

Rode o app em:

Emulador Android

Dispositivo físico Android (SDK ≥ 24)

Faça login com:

Usuário: admin
Senha: 123456

👨‍💻 Autores / Equipe

Gabriel Valério – RM 552041

Thiago Ratão – RM 551351
