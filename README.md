# Sejam bem vindos(as) ao meu repositório : rabbitmq_example


- :mortar_board: Este repositório baseia-se em um tutorial referente ao RabbitMQ baseado na página : https://blog.tericcabrel.com/spring-boot-applications-rabbitmq/
- :construction: Foi utilizado para construção as seguintes ferramentas: JDK 17, Intellij, Postman, Docker.
- :memo: Serão realizadas duas pequenas aplicações sendo uma delas a consumidora da fila e outra que publicará uma mensagem na fila.

Usamos o RabbitMQ para enviar e receber mensagens de forma assíncrona entre dois aplicativos Spring Boot. Usamos a dependência do Spring para RabbitMQ e o AMQP para estabelecer a conexão com o servidor, enviar e receber mensagens. Aqui estão alguns pontos:

As opções de conexão são definidas em application.properties e são tratadas automaticamente pela dependência Spring for RabbitMQ.
- Deve-se criar manualmente a fila na interface Web Administration.
- O produtor deve enviar a mensagem como uma string.
- O consumidor recebe a mensagem e a analisa em um objeto Java antes de usá-la.
  <br><br>

 # Passo a passo:
 <br>
  <strong>1 - </strong>Tenha instalado em sua máquina uma imagem do RabbitMQ e deixe-a ativa<br> (docker run -it --name testerabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management) ;<br><br>
  <strong>2 - </strong>Na interface local do RabbitMQ (http://localhost:15672) crie uma fila de nome user-registration;<br><br>
  <strong>3 - </strong>Clone este repositório;<br><br>
  <strong>4 - </strong>Inicie a aplicação rabbitmq_exemple_consumer;<br><br>
  <strong>5 - </strong>Inicie a aplicação rabbitmq_exemple e poste uma mensagem na fila criada anteriormente conforme a requisição abaixo:<br><br>

  ![image](https://github.com/samucaopcao/rabbitmq_example/assets/59769434/25e83e88-725c-4c53-91f4-1c43065fd4ae)<br>

Pronto! Você verá no console da aplicação  rabbitmq_exemple_consumer a menssagem que foi enviada para a fila pois nesta aplicação consumimos a fila citada.

