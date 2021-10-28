# 📢프로젝트 소개

질병을 의미하는 Disease에서 비슷한 발음인 **THISIS**로 프로젝트 이름을 정하였습니다.
환자들끼리 부족한 정보들을 얻기 위한 목적에 있는 질병 SNS로써 역할을 하기 위해 프로젝트를 진행하게 되었습니다. 
회원가입, 로그인, 유저 팔로우 등 명세서 기반 기본 기능을 바탕으로 해 실질적으로 유용한 질병 관리 SNS를 추구합니다. 

<img src ="https://img.shields.io/badge/platform-Web-red"></img>
<img src ="https://img.shields.io/badge/framework-Spring-skyblue"></img>
<img src ="https://img.shields.io/badge/database-MySQL-silver"></img> 
<img src ="https://img.shields.io/badge/server-tomcat-gold"></img>
<img src ="https://img.shields.io/badge/language-Java-purple"></img>



# ⌛ 프로젝트 개발 일정

1. 10/25 - 프로젝트 계획 수립 및 DB 설계 (URL 및 핵심 기능들) & 알고리즘 채택 (base62) 
2. 10/26 - URL DB 구현 및 Rest API 구성&  URL DAO, Service, Service Impl, Controller 구성 및 DB와 연동 & Swagger로 확인
3. 10/27 - 추가적인 기능 구현(로그인, 로그아웃, 패스워드 - salt 알고리즘 활용, 회원탈퇴)
4. 10/28 - 전체적인 프로젝트 정리 및 오류 수정 & Readme 작성 
5. 10/29 - 제출 (마지막 확인)



# 🛠 프로젝트 개발 환경 설정




## Backend 개발환경

##### Spring Boot 설치

> 간단한 구성을 위해 Spriong Boot 를 이용한다.

- Spring 사용을 위한 JDK 설치

  OpenJDK 공식 웹사이트에서 압축 파일을 다운로드 받고 압축 해제 후 해당 경로를 기억한다.

- 환경 변수 설정

  [내 컴퓨터 - 속성] -> [고급 시스템 설정] -> [환경 변수] -> [새로 만들기]

  - 변수 이름:  `JAVA_HOME`
  - 변수 값: `{해당 경로}`

  Path 편집 -> 변수 값에 `%JAVA_HOME%\bin` 추가

- 명령 프롬프트 -> `java -version` 설치 확인

- [Maven 설치](http://maven.apache.org/download.cgi)

- 환경 변수 설정

  - 변수 이름: `MAVEN_HOME`
  - 변수 값: `{해당 경로}`

  Path 편집 -> 변수 값에 `%MAVEN_HOME%\bin` 추가

- 명령 프롬프트 -> `mvn -v` 설치 확인

- VScode 설치
  - Spring Boot Extension Pack 설치
  - ctrl + shift + P -> Spring Initializer:Generate Maven Project 실행
    - Project Language: Java
    - Spring Boot Version: 2.2.2
    - Dependency: Lombok, Spring Web 선택

- DB 연결

  - pom.xml 에 아래 구문 추가

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

  - application.properties 에 아래 구문 추가

    ```properties
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/new?autoReconnect=true&useUnicode=true&characterEncoding=utf8
    spring.datasource.username=root
    spring.datasource.password={비밀번호}
    ```
    
## 개발 환경 및 IDE

<img src="https://t1.daumcdn.net/cfile/tistory/213F23475902E2B619" width="80px"></img>
STS를 사용해 BackEnd 작업



## DB sql문 설정

##### 회원 테이블
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

##### url 테이블

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
| URL 전체 조회               | /address                    | GET    | 저장되어 있는 URL 전체 조회               |
| URL 짧은 주소 획득(Shorten) | /address                    | POST   | 긴 URL 주소를 통해 짧은 URL주소를 획득    |
| URL 긴 주소 획득(Redirect)  | /address/getlong/{shorturl} | GET    | 짧은 URL 주소를 통해 원본 URL 주소를 획득 |
| URL 삭제                    | /address                    | DELETE | 저장되어 있는 URL 삭제                    |
| 회원 전체 조회              | /user                       | GET    | 회원가입 된 전체 회원들 정보 조회         |
| 회원상세정보                | /user/find/{nick}           | GET    | 해당 닉네임 회원 정보 조회                |
| 회원가입                    | /user/signup                | POST   | 회원 가입                                 |
| 회원정보 변경               | /user                       | PUT    | 회원정보 변경                             |
| 회원 탈퇴                   | /account/{nick}             | DELETE | 해당 닉네임 회원 정보 삭제                |

## Browser Support
|<img src="https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/bb/72/49/bb72493a-6ede-8369-5513-f1e9f930b642/AppIcon-0-1x_U007emarketing-0-6-0-0-85-220.png/246x0w.png" width="80px"> |<img src = "https://zdnet4.cbsistatic.com/hub/i/2019/01/29/f4eba7da-10cd-4b45-b974-464c08e145be/microsoft-edge.png" width="80px"></img>|<img src = "https://t1.daumcdn.net/cfile/tistory/253EC1495495846E1C" width = "80px"></img>|
|--|--|--|
|latest✔|latest✔|latest✔|


# 👀 서비스 설명 

URL을 받아서 base62 알고리즘을 활용하여 짧게 인코딩하였습니다. DB의 적재량을 줄이기 위해 Long URL만 저장해두고 Short URL의 경우 인코딩해서 바로 나타낼 수 있게 하였고 역의 Redirect의 경우 base62 알고리즘의 디코딩을 통해 원래 URL을 얻어내게 하였습니다.



URL을 입력받을 때 URL 형식이 아니면 오류가 나게 구성하였고 DB에 저장할 때는 https://부분을 삭제하여 조금 더 편리하게 구성하였습니다. 



추가적으로 구성한 구현은 로그인/로그아웃 등 회원관리 페이지입니다. 이 페이지를 추가적으로 구현한 이유는 salt알고리즘을 활용하여 비밀번호를 무작위로 길게 저장해두고 회원 각자의 salt를 통해 디코딩해서 원래 패스워드를 알아내는 방식이 위의 URL 방식과 비슷하다고 생각하여 진행하였습니다.

회원가입을 진행하면 User 테이블에 저장이 되고 삭제, 변경, 조회, 전체 유저 조회 기능을 구현하였습니다. 

 

# :athletic_shoe: 후기 및 개선 방향

- 짧은 시간이여서 완성도가 높지 않아서 아쉬웠지만 URL을 줄이고 다시 Redirect하는 기능은 정상적으로 작동하여서 만족하였다
- DB를 최대한 관계가 없이 구현하여서 간단한 프로젝트로 끝났지만 차후에 여러 기능들을 구현해보고 싶다
  - 이메일 인증 - 저장되어 있는 이메일을 통해 이메일 인증으로 회원가입 여부를 판단한다 (인증이 된 유저들만 회원가입이 진행되게)
  - 유저들의 URL 저장소
    - 유저들이 로그인 한 후 자주 사용하는 URL들을 따로 저장해두는 관계테이블을 구성해서 조금 더 생산적인 서비스를 만들고 싶다
    - URL 저장소를 웹사이트 특징에 따라 분류해(검색, 스포츠, 교육 등등) 마치 유저들의 원하는 웹페에지 URL 저장소 기능을 만들면 좋을 것 같다



# 📜License

본 가이드는 MIT 라이선스 하에 공개합니다 <img src = "https://img.shields.io/badge/license-MIT-pink" width=80></img>

* 공유 - 복제, 배포, 포맷 변경, 전송, 전시, 공연, 방송할 수 있습니다.
* 변경 - 리믹스, 변형, 2차적 저작물 작성 및 영리목적의 이용이 가능합니다. 




