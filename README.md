# CodingChallenge

GoHenry Coding Challenge - ParentData Management

An API design to add/retrive the parent/child information using REST APIs

Prerequisites : - 


JDK 1.8

Spring Tool Suite

Apache Maven

H2 Console - DB verification

GIT

Postman

Run the application locally using : mvn spring-boot:run

Project build commands: 

mvn clean install

mvn clean test 

Files And Directories

 Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.gohenry.challenge
│           ├── com.gohenry.challenge.config
│           ├── com.gohenry.challenge.controller
│           ├── com.gohenry.challenge.exception
│           ├── com.gohenry.challenge.repository
│           ├── com.gohenry.challenge.dto
│           └── com.gohenry.challenge.service
├── src
│   └── main
│       └── resources
│           └── static
│           ├── templates
│           ├── application.properties
│           ├── parent-dozer-mapping.xml
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── src
├── target
│   └──parentdetails-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

APIs
------
1 : Save Parent-Child information

URL : http://localhost:8080/parents/

Input  :- {  
  
   "title":"Mrs",
   "firstName":"Jane",
   "lastName":"Doe",
   "emailAddress":"jane.doe@gohenry.co.uk",
   "dateOfBirth":"1990-06-03",
   "gender":"female",
   "secondName":"",
   "children":[  
      {  
        
         "firstName":"Janet",
         "lastName":"Doe",
         "emailAddress":"janet.doe@gohenry.co.uk",
         "dateOfBirth":"2010-05-22",
         "gender":"female",
         "secondName":""
      },
      {  
        
         "firstName":"Jason",
         "lastName":"Doe",
         "emailAddress":"jason.doe@gohenry.co.uk",
         "dateOfBirth":"2008-12-05",
         "gender":"male",
         "secondName":""
      }
   ]
}

Output :

{
    "id": 1,
    "title": "Mrs",
    "firstName": "Jane",
    "lastName": "Doe",
    "emailAddress": "jane.doe@gohenry.co.uk",
    "dateOfBirth": "1990-06-03",
    "gender": "female",
    "secondName": "",
    "children": [
        {
            "id": 1,
            "firstName": "Janet",
            "lastName": "Doe",
            "emailAddress": "janet.doe@gohenry.co.uk",
            "dateOfBirth": "2010-05-22",
            "gender": "female",
            "secondName": ""
        },
        {
            "id": 2,
            "firstName": "Jason",
            "lastName": "Doe",
            "emailAddress": "jason.doe@gohenry.co.uk",
            "dateOfBirth": "2008-12-05",
            "gender": "male",
            "secondName": ""
        }
    ]
}

2 : Retrieve Parent details by Id

URL : http://localhost:8080/parents/1/ 

OutPut :

{
    "id": 1,
    "title": "Mrs",
    "firstName": "Jane",
    "lastName": "Doe",
    "emailAddress": "jane.doe@gohenry.co.uk",
    "dateOfBirth": "1990-06-03",
    "gender": "female",
    "secondName": "",
    "children": [
        {
            "id": 1,
            "firstName": "Janet",
            "lastName": "Doe",
            "emailAddress": "janet.doe@gohenry.co.uk",
            "dateOfBirth": "2010-05-22",
            "gender": "female",
            "secondName": ""
        },
        {
            "id": 2,
            "firstName": "Jason",
            "lastName": "Doe",
            "emailAddress": "jason.doe@gohenry.co.uk",
            "dateOfBirth": "2008-12-05",
            "gender": "male",
            "secondName": ""
        }
    ]
}



