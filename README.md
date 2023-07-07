# rabbitmq_example

Usamos o RabbitMQ para enviar e receber mensagens de forma assíncrona entre dois aplicativos Spring Boot. Usamos a dependência do Spring para RabbitMQ e o AMQP para estabelecer a conexão com o servidor, enviar e receber mensagens. Aqui estão as sugestões:

As opções de conexão são definidas em application.properties e são tratadas automaticamente pela dependência Spring for RabbitMQ.
Você deve criar manualmente a fila na interface Web Administration.
O produtor deve enviar a mensagem como uma string.
O consumidor recebe a mensagem e a analisa em um objeto Java antes de usá-la.
