# Sejam bem vindos(as) ao meu repositório : rabbitmq_example


- :mortar_board: Este repositório baseia-se em um tutorial referente ao RabbitMQ.
- :construction: Foi utilizado para construção as seguintes ferramentas: JDK 17, Intellij, Postman.
- :memo: Seão realizadas duas pequenas aplicações sendo uma delas a consumidora da fila e outra que publicará uma mensagem na fila.

Usamos o RabbitMQ para enviar e receber mensagens de forma assíncrona entre dois aplicativos Spring Boot. Usamos a dependência do Spring para RabbitMQ e o AMQP para estabelecer a conexão com o servidor, enviar e receber mensagens. Aqui estão as sugestões:

As opções de conexão são definidas em application.properties e são tratadas automaticamente pela dependência Spring for RabbitMQ.
- Você deve criar manualmente a fila na interface Web Administration.
- O produtor deve enviar a mensagem como uma string.
- O consumidor recebe a mensagem e a analisa em um objeto Java antes de usá-la.

