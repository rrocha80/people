-- Essa arquivo data.sql é automaticamente carregando pelo Spring Boot quando a aplicação sobe.
-- /peopleregisted/src/main/resources/data.sql
-- Ref:
--   https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto-database-initialization
--   https://stackoverflow.com/questions/38040572/spring-boot-loading-initial-data/38047021#38047021
-- Obs: Tive que por as colunas no INSERT, pois dependendo de como o banco é criado, a ordem
-- das colunas pode mudar!


--insert into contato (id, nome, email) values (null, 'João da Silva', 'joao.silva@email.com');
--insert into contato (id, nome, email) values (null, 'Marina Andrade', 'marina.andrade@email.com');

--create table pessoa(id int primary key , nome varchar(200), sexo varchar(15), email varchar(150), data_nascimento date, naturalidade varchar(100), nacionalidade varchar(100), cpf varchar(14), data_cadastro timestamp, data_atualizacao timestamp)

insert into usuario (nome, senha, papel) values ('admin', 'admin', 'ADMIN');

insert into pessoa (nome, sexo, email, data_nascimento, naturalidade, nacionalidade, cpf, data_cadastro) values ('Rodrigo Rocha', 'MASCULINO', 'rodrigo@gmail.com', '1980-04-02', 'Natal', 'BRASIL', '756.348.600-32', '2020-02-06 22:00:30');
insert into pessoa (nome, sexo, email, data_nascimento, naturalidade, nacionalidade, cpf, data_cadastro) values ('Giovany Lyan', 'MASCULINO', 'lyan@gmail.com', '2010-03-04', 'Natal', 'BRASIL', '036.371.150-34', '2020-02-06 22:15:30');