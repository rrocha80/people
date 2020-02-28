# people
CRUD Spring Boot + JSF + Primefaces

# Itens antendidos no desafio ténico:
- item A: Criar uma aplicação java web utilizando JavaServer Faces (JSF);
- item B: Utilizar persistência em um banco de dados (qualquer banco desejado);
- item C: Utilizar Hibernate e JPA;
- item D: Utilizar Spring Framework Boot 2.0;
- item G: Utilizar Primefaces.

Desenvolvi um CRUD de pessoas, pois não consegui acessar o link que foi disponibilizado para verificar o modelo em questão, também implementei uma autenticação para acesso ao sistema (Usuário: admin, senha: admin).

Utilizei o banco h2, pois é um banco escrito em java e roda em tempo de execução. 

Para acessar o sistema é necessário executar o seguinte comando, pois enviei o sistema compilado, o arquivo está na pasta "src\other":

>> java -jar people.jar

Posterior a isto acessar o link "http://localhost:8080/login".

# Credenciais para acesso ao sistema:
Usuário: admin
Senha: admin


# Docker
Também fiz uma stack com docker, nele tem um banco mysql e o sistema executar ao subir o container, para isto basta acessar a pasta onde se encontra o arquivo "docker-compose.yml" que se encontra na raiz do projeto e executar o seguinte comando:

>> docker-compose up

Pré requisto: ter o doker instalado na máquina.