# ๐ขํ๋ก์ ํธ ์๊ฐ

์ง๋ณ์ ์๋ฏธํ๋ Disease์์ ๋น์ทํ ๋ฐ์์ธ **THISIS**๋ก ํ๋ก์ ํธ ์ด๋ฆ์ ์ ํ์์ต๋๋ค.
ํ์๋ค๋ผ๋ฆฌ ๋ถ์กฑํ ์ ๋ณด๋ค์ ์ป๊ธฐ ์ํ ๋ชฉ์ ์ ์๋ ์ง๋ณ SNS๋ก์จ ์ญํ ์ ํ๊ธฐ ์ํด ํ๋ก์ ํธ๋ฅผ ์งํํ๊ฒ ๋์์ต๋๋ค. 
ํ์๊ฐ์, ๋ก๊ทธ์ธ, ์ ์  ํ๋ก์ฐ ๋ฑ ๋ช์ธ์ ๊ธฐ๋ฐ ๊ธฐ๋ณธ ๊ธฐ๋ฅ์ ๋ฐํ์ผ๋ก ํด ์ค์ง์ ์ผ๋ก ์ ์ฉํ ์ง๋ณ ๊ด๋ฆฌ SNS๋ฅผ ์ถ๊ตฌํฉ๋๋ค. 

<img src ="https://img.shields.io/badge/platform-Web-red"></img>
<img src ="https://img.shields.io/badge/framework-Spring-skyblue"></img>
<img src ="https://img.shields.io/badge/database-MySQL-silver"></img> 
<img src ="https://img.shields.io/badge/server-tomcat-gold"></img>
<img src ="https://img.shields.io/badge/language-Java-purple"></img>



# โ ํ๋ก์ ํธ ๊ฐ๋ฐ ์ผ์ 

1. 10/25 - ํ๋ก์ ํธ ๊ณํ ์๋ฆฝ ๋ฐ DB ์ค๊ณ (URL ๋ฐ ํต์ฌ ๊ธฐ๋ฅ๋ค) & ์๊ณ ๋ฆฌ์ฆ ์ฑํ (base62) 
2. 10/26 - URL DB ๊ตฌํ ๋ฐ Rest API ๊ตฌ์ฑ&  URL DAO, Service, Service Impl, Controller ๊ตฌ์ฑ ๋ฐ DB์ ์ฐ๋ & Swagger๋ก ํ์ธ
3. 10/27 - ์ถ๊ฐ์ ์ธ ๊ธฐ๋ฅ ๊ตฌํ(๋ก๊ทธ์ธ, ๋ก๊ทธ์์, ํจ์ค์๋ - salt ์๊ณ ๋ฆฌ์ฆ ํ์ฉ, ํ์ํํด)
4. 10/28 - ์ ์ฒด์ ์ธ ํ๋ก์ ํธ ์ ๋ฆฌ ๋ฐ ์ค๋ฅ ์์  & Readme ์์ฑ 
5. 10/29 - ์ ์ถ (๋ง์ง๋ง ํ์ธ)



# ๐  ํ๋ก์ ํธ ๊ฐ๋ฐ ํ๊ฒฝ ์ค์ 




## Backend ๊ฐ๋ฐํ๊ฒฝ

##### Spring Boot ์ค์น

> ๊ฐ๋จํ ๊ตฌ์ฑ์ ์ํด Spriong Boot ๋ฅผ ์ด์ฉํ๋ค.

- Spring ์ฌ์ฉ์ ์ํ JDK ์ค์น

  OpenJDK ๊ณต์ ์น์ฌ์ดํธ์์ ์์ถ ํ์ผ์ ๋ค์ด๋ก๋ ๋ฐ๊ณ  ์์ถ ํด์  ํ ํด๋น ๊ฒฝ๋ก๋ฅผ ๊ธฐ์ตํ๋ค.

- ํ๊ฒฝ ๋ณ์ ์ค์ 

  [๋ด ์ปดํจํฐ - ์์ฑ] -> [๊ณ ๊ธ ์์คํ ์ค์ ] -> [ํ๊ฒฝ ๋ณ์] -> [์๋ก ๋ง๋ค๊ธฐ]

  - ๋ณ์ ์ด๋ฆ:  `JAVA_HOME`
  - ๋ณ์ ๊ฐ: `{ํด๋น ๊ฒฝ๋ก}`

  Path ํธ์ง -> ๋ณ์ ๊ฐ์ `%JAVA_HOME%\bin` ์ถ๊ฐ

- ๋ช๋ น ํ๋กฌํํธ -> `java -version` ์ค์น ํ์ธ

- [Maven ์ค์น](http://maven.apache.org/download.cgi)

- ํ๊ฒฝ ๋ณ์ ์ค์ 

  - ๋ณ์ ์ด๋ฆ: `MAVEN_HOME`
  - ๋ณ์ ๊ฐ: `{ํด๋น ๊ฒฝ๋ก}`

  Path ํธ์ง -> ๋ณ์ ๊ฐ์ `%MAVEN_HOME%\bin` ์ถ๊ฐ

- ๋ช๋ น ํ๋กฌํํธ -> `mvn -v` ์ค์น ํ์ธ

- VScode ์ค์น
  - Spring Boot Extension Pack ์ค์น
  - ctrl + shift + P -> Spring Initializer:Generate Maven Project ์คํ
    - Project Language: Java
    - Spring Boot Version: 2.2.2
    - Dependency: Lombok, Spring Web ์ ํ

- DB ์ฐ๊ฒฐ

  - pom.xml ์ ์๋ ๊ตฌ๋ฌธ ์ถ๊ฐ

    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>
    
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    ```

  - application.properties ์ ์๋ ๊ตฌ๋ฌธ ์ถ๊ฐ

    ```properties
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/new?autoReconnect=true&useUnicode=true&characterEncoding=utf8
    spring.datasource.username=root
    spring.datasource.password={๋น๋ฐ๋ฒํธ}
    ```
    
## ๊ฐ๋ฐ ํ๊ฒฝ ๋ฐ IDE

<img src="https://t1.daumcdn.net/cfile/tistory/213F23475902E2B619" width="80px"></img>
STS๋ฅผ ์ฌ์ฉํด BackEnd ์์



## DB sql๋ฌธ ์ค์ 

##### ํ์ ํ์ด๋ธ
``` sql
CREATE TABLE `user` (
  `id` Integer NOT NULL auto_increment,
  `email` varchar(128) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `nickname` varchar(128) DEFAULT NULL,
  `username` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_idx_unique_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

##### url ํ์ด๋ธ

```sql
CREATE TABLE `url` (
  `id` Integer NOT NULL auto_increment,
  `longurl` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

##### 
## Rest API
|Task|URL|Method|Action|
|---|------|--|--------|
| URL ์ ์ฒด ์กฐํ               | /address                    | GET    | ์ ์ฅ๋์ด ์๋ URL ์ ์ฒด ์กฐํ               |
| URL ์งง์ ์ฃผ์ ํ๋(Shorten) | /address                    | POST   | ๊ธด URL ์ฃผ์๋ฅผ ํตํด ์งง์ URL์ฃผ์๋ฅผ ํ๋    |
| URL ๊ธด ์ฃผ์ ํ๋(Redirect)  | /address/getlong/{shorturl} | GET    | ์งง์ URL ์ฃผ์๋ฅผ ํตํด ์๋ณธ URL ์ฃผ์๋ฅผ ํ๋ |
| URL ์ญ์                     | /address                    | DELETE | ์ ์ฅ๋์ด ์๋ URL ์ญ์                     |
| ํ์ ์ ์ฒด ์กฐํ              | /user                       | GET    | ํ์๊ฐ์ ๋ ์ ์ฒด ํ์๋ค ์ ๋ณด ์กฐํ         |
| ํ์์์ธ์ ๋ณด                | /user/find/{nick}           | GET    | ํด๋น ๋๋ค์ ํ์ ์ ๋ณด ์กฐํ                |
| ํ์๊ฐ์                    | /user/signup                | POST   | ํ์ ๊ฐ์                                 |
| ํ์์ ๋ณด ๋ณ๊ฒฝ               | /user                       | PUT    | ํ์์ ๋ณด ๋ณ๊ฒฝ                             |
| ํ์ ํํด                   | /account/{nick}             | DELETE | ํด๋น ๋๋ค์ ํ์ ์ ๋ณด ์ญ์                 |

## Browser Support
|<img src="https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/bb/72/49/bb72493a-6ede-8369-5513-f1e9f930b642/AppIcon-0-1x_U007emarketing-0-6-0-0-85-220.png/246x0w.png" width="80px"> |<img src = "https://zdnet4.cbsistatic.com/hub/i/2019/01/29/f4eba7da-10cd-4b45-b974-464c08e145be/microsoft-edge.png" width="80px"></img>|<img src = "https://t1.daumcdn.net/cfile/tistory/253EC1495495846E1C" width = "80px"></img>|
|--|--|--|
|latestโ|latestโ|latestโ|


# ๐ ์๋น์ค ์ค๋ช 

URL์ ๋ฐ์์ base62 ์๊ณ ๋ฆฌ์ฆ์ ํ์ฉํ์ฌ ์งง๊ฒ ์ธ์ฝ๋ฉํ์์ต๋๋ค. DB์ ์ ์ฌ๋์ ์ค์ด๊ธฐ ์ํด Long URL๋ง ์ ์ฅํด๋๊ณ  Short URL์ ๊ฒฝ์ฐ ์ธ์ฝ๋ฉํด์ ๋ฐ๋ก ๋ํ๋ผ ์ ์๊ฒ ํ์๊ณ  ์ญ์ Redirect์ ๊ฒฝ์ฐ base62 ์๊ณ ๋ฆฌ์ฆ์ ๋์ฝ๋ฉ์ ํตํด ์๋ URL์ ์ป์ด๋ด๊ฒ ํ์์ต๋๋ค.



URL์ ์๋ ฅ๋ฐ์ ๋ URL ํ์์ด ์๋๋ฉด ์ค๋ฅ๊ฐ ๋๊ฒ ๊ตฌ์ฑํ์๊ณ  DB์ ์ ์ฅํ  ๋๋ https://๋ถ๋ถ์ ์ญ์ ํ์ฌ ์กฐ๊ธ ๋ ํธ๋ฆฌํ๊ฒ ๊ตฌ์ฑํ์์ต๋๋ค. 



์ถ๊ฐ์ ์ผ๋ก ๊ตฌ์ฑํ ๊ตฌํ์ ๋ก๊ทธ์ธ/๋ก๊ทธ์์ ๋ฑ ํ์๊ด๋ฆฌ ํ์ด์ง์๋๋ค. ์ด ํ์ด์ง๋ฅผ ์ถ๊ฐ์ ์ผ๋ก ๊ตฌํํ ์ด์ ๋ salt์๊ณ ๋ฆฌ์ฆ์ ํ์ฉํ์ฌ ๋น๋ฐ๋ฒํธ๋ฅผ ๋ฌด์์๋ก ๊ธธ๊ฒ ์ ์ฅํด๋๊ณ  ํ์ ๊ฐ์์ salt๋ฅผ ํตํด ๋์ฝ๋ฉํด์ ์๋ ํจ์ค์๋๋ฅผ ์์๋ด๋ ๋ฐฉ์์ด ์์ URL ๋ฐฉ์๊ณผ ๋น์ทํ๋ค๊ณ  ์๊ฐํ์ฌ ์งํํ์์ต๋๋ค.

ํ์๊ฐ์์ ์งํํ๋ฉด User ํ์ด๋ธ์ ์ ์ฅ์ด ๋๊ณ  ์ญ์ , ๋ณ๊ฒฝ, ์กฐํ, ์ ์ฒด ์ ์  ์กฐํ ๊ธฐ๋ฅ์ ๊ตฌํํ์์ต๋๋ค. 

 

# :athletic_shoe: ํ๊ธฐ ๋ฐ ๊ฐ์  ๋ฐฉํฅ

- ์งง์ ์๊ฐ์ด์ฌ์ ์์ฑ๋๊ฐ ๋์ง ์์์ ์์ฌ์ ์ง๋ง URL์ ์ค์ด๊ณ  ๋ค์ Redirectํ๋ ๊ธฐ๋ฅ์ ์ ์์ ์ผ๋ก ์๋ํ์ฌ์ ๋ง์กฑํ์๋ค
- DB๋ฅผ ์ต๋ํ ๊ด๊ณ๊ฐ ์์ด ๊ตฌํํ์ฌ์ ๊ฐ๋จํ ํ๋ก์ ํธ๋ก ๋๋ฌ์ง๋ง ์ฐจํ์ ์ฌ๋ฌ ๊ธฐ๋ฅ๋ค์ ๊ตฌํํด๋ณด๊ณ  ์ถ๋ค
  - ์ด๋ฉ์ผ ์ธ์ฆ - ์ ์ฅ๋์ด ์๋ ์ด๋ฉ์ผ์ ํตํด ์ด๋ฉ์ผ ์ธ์ฆ์ผ๋ก ํ์๊ฐ์ ์ฌ๋ถ๋ฅผ ํ๋จํ๋ค (์ธ์ฆ์ด ๋ ์ ์ ๋ค๋ง ํ์๊ฐ์์ด ์งํ๋๊ฒ)
  - ์ ์ ๋ค์ URL ์ ์ฅ์
    - ์ ์ ๋ค์ด ๋ก๊ทธ์ธ ํ ํ ์์ฃผ ์ฌ์ฉํ๋ URL๋ค์ ๋ฐ๋ก ์ ์ฅํด๋๋ ๊ด๊ณํ์ด๋ธ์ ๊ตฌ์ฑํด์ ์กฐ๊ธ ๋ ์์ฐ์ ์ธ ์๋น์ค๋ฅผ ๋ง๋ค๊ณ  ์ถ๋ค
    - URL ์ ์ฅ์๋ฅผ ์น์ฌ์ดํธ ํน์ง์ ๋ฐ๋ผ ๋ถ๋ฅํด(๊ฒ์, ์คํฌ์ธ , ๊ต์ก ๋ฑ๋ฑ) ๋ง์น ์ ์ ๋ค์ ์ํ๋ ์นํ์์ง URL ์ ์ฅ์ ๊ธฐ๋ฅ์ ๋ง๋ค๋ฉด ์ข์ ๊ฒ ๊ฐ๋ค



# ๐License

๋ณธ ๊ฐ์ด๋๋ MIT ๋ผ์ด์ ์ค ํ์ ๊ณต๊ฐํฉ๋๋ค <img src = "https://img.shields.io/badge/license-MIT-pink" width=80></img>

* ๊ณต์  - ๋ณต์ , ๋ฐฐํฌ, ํฌ๋งท ๋ณ๊ฒฝ, ์ ์ก, ์ ์, ๊ณต์ฐ, ๋ฐฉ์กํ  ์ ์์ต๋๋ค.
* ๋ณ๊ฒฝ - ๋ฆฌ๋ฏน์ค, ๋ณํ, 2์ฐจ์  ์ ์๋ฌผ ์์ฑ ๋ฐ ์๋ฆฌ๋ชฉ์ ์ ์ด์ฉ์ด ๊ฐ๋ฅํฉ๋๋ค. 




