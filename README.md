# kafka-gleds
nesse piloto usei:
o zookeeper e o kafka server. 
via MAC OS - iterm - com abas exclusivas para cada serviço 

- a app kafka-gleds para consumir topicos. (desenvolvida em maven  + dep e plugin kafka)

- usei a linhas de comandos 
para subir serviços 
```
$~/kafka/config   ruby-2.6.3                                                                                                                                                                               ⍉
▶ zookeeper-server-start.sh $HOME/kafka/config/zookeeper.properties

~/kafka/config   ruby-2.6.3                                                                                                                                                                               ⍉
▶ kafka-server-start.sh server.properties


```

e para criar topicos 
```
▶ kafka-topics.sh --bootstrap-server localhost:9092 --create --topic TesteJava
Created topic TesteJava.
````
para verificar os topicos criados usei:
'''
kafka-topics.sh --bootstrap-server localhost:9092 --list
'''

para criar um produtor de mensagens

```
kafka-console-producer.sh --broker-list  localhost:9092 --topic TesteJava
```
apos o sinal basta digitar. 


Erros ou duvida me procure.
Gleds3000 








