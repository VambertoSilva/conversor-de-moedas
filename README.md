# 💱 Conversor de Moedas – Projeto Java Console

Este projeto foi desenvolvido como parte de um desafio prático projeto ONE. O objetivo é criar um aplicativo simples em Java que realiza a conversão entre diferentes moedas utilizando uma API pública de câmbio (https://www.exchangerate-api.com/).

A aplicação é executada no console e apresenta um menu interativo com opções de conversão entre moedas como Dólar, Real, Euro e Libra.

---

## 📸 Preview

O projeto é totalmente baseado em linha de comando (console), ideal para reforçar conceitos de lógica e programação Java orientada a objetos.

---

## 🚀 Funcionalidades

- Menu interativo com 6 opções de conversão e opção de saída.
- Entrada de valor pelo usuário para conversão.
- Requisições à API pública para obter taxas de câmbio em tempo real.
- Exibição do resultado da conversão no console.
- Tratamento de opções inválidas e erros de conexão.

---

## 🛠️ Tecnologias Utilizadas

- Java 17 (ou superior)
- Biblioteca [Gson](https://github.com/google/gson) para leitura de JSON
- Maven para gerenciamento de dependências
- API [ExchangeRate API](https://www.exchangerate-api.com/) (plano gratuito)

---

## 📂 Estrutura do Projeto

```
conversor-de-moedas/
├── src/
│   └── conversor/
│       ├── app/
│       │   └── ConversorApplication.java
│       ├── service/
│       │   └── ConversorService.java
│       ├── model/
│       │   └── ExchangeResponse.java
│       └── utils/
│           └── HttpClient.java
├── pom.xml
```

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/conversor-de-moedas
```

2. Acesse a pasta do projeto:

```bash
cd conversor-de-moedas
```

3. Adicione sua chave da API no arquivo `ConversorService.java`, caso a atual não esteja funcionando

4. Compile o projeto com Maven:

```bash
mvn compile
```

5. Execute o projeto:

```bash
mvn exec:java -Dexec.mainClass="conversor.app.ConversorApplication"
```

---

## 📌 Observações

- A API usada possui um plano gratuito, mas requer registro para obter a chave de acesso.
- O código foi escrito de forma simples e sem uso de anotações do Spring, para manter a compatibilidade com o nível básico do curso.
- O projeto é ideal para iniciantes em Java que desejam treinar: `Scanner`, organização de classes, chamadas HTTP e parsing de JSON com Gson.

---

## 🐞 Possíveis Problemas

- Se a conversão não funcionar, verifique sua conexão com a internet e se a chave da API está correta.
- Se você ultrapassar o limite de requisições da API gratuita, a resposta pode falhar.
- Certifique-se de estar usando uma versão do Java compatível (Java 17 ou superior recomendado).

---

## 💡 Melhorias Futuras

- Suporte a mais moedas.
- Permitir converter em ambos os sentidos em uma só opção.
- Adicionar histórico das conversões.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e pode ser usado livremente para estudos e prática.

---

## 👨‍💻 Autor

Desenvolvido por Vamberto Silva
