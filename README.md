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

## Populando o Banco

```sql
insert into tb_tarefas (tar_data_criacao, tar_descricao, tar_nome, tar_status) values (NOW(), 'descricao um', 'Un', 'ABERTA');
insert into tb_tarefas (tar_data_criacao, tar_descricao, tar_nome, tar_status) values (NOW(), 'descricao dos', 'Dos', 'ABERTA');
insert into tb_tarefas (tar_data_criacao, tar_descricao, tar_nome, tar_status) values (NOW(), 'descricao tres', 'Tres', 'ABERTA');
```

## Rodando

Crie o banco com o script de criação 
Popule o banco com o scripts de população
Suba a aplicação no Tomcat

