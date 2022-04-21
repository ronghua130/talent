# AMF Talent(재능) 도메인 구현 

<Maria DB연결>

1. (한번만 설치하면 다른 프로젝트에서 사용 가능하다)
   설치: > docker run --name maria -d -p 3306:3306 -e MARIADB_ROOT_PASSWORD=admin  mariadb:latest
2. 실행: > docker exec -it maria  /bin/bash
3. 접속:  root@251ce07fd6fc:/# mysql --user=root --password=$MARIADB_ROOT_PASSWORD
4. db생성: MariaDB [(none)]> create database petstore;
5. - application.yaml 의 설정
```
spring:
  jpa:
    hibernate:
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      ddl-auto: update
    properties:
      hibernate:
        show_sql: true
        format_sql: true
        dialect: org.hibernate.dialect.MySQL57Dialect
  datasource:
    url: jdbc:mysql://localhost:3306/petstore
    username: root
    password: admin
    driverClassName: com.mysql.cj.jdbc.Driver
```
6. 사용db설정:  MariaDB [(none)]> use petstore
7. MariaDB [petstore]> show tables;
8. MariaDB [petstore]> select * from Pet;
