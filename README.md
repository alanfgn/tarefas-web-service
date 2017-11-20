# Web Service REST com Jersey - Tarefas Web Service

Exemplo de Web Service usando jersey

## Precisa

* Tomcat 8.5 
* Mysql 5.7.14
* Maven

## Criando o Banco

```sql
CREATE DATABASE tarefas_web_service;
GRANT ALL PRIVILEGES ON tarefas_web_service.* TO tarefaswebservice@localhost IDENTIFIED BY 'tarefaswebservice' WITH GRANT OPTION;
```

## Rodando

1. Crie o banco com o script de criação 
2. Suba a aplicação no Tomcat
