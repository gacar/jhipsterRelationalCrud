# Jhipster Relational Crud

- This application was generated using JHipster. 

- Employee and Task classes were generated with jdl.

- This application shows that how `jhipster jdl jhipster-jdl.jdl` command was used to generete Services, DTO classes, repositories and paginations 

- DTO objects were created and  mapstruct was used.

- Postgresql instances should be created for testing.

- you can user jhister.tech for more documentation 


### tech stack

| Tech          | Version                                                                                                 |
|---------------|---------------------------------------------------------------------------------------------------------|
| `jhipster`    | 8.0.0-beta.3   |
| `Java`        | 17                                                                                                      |
| `Spring Boot` | 3.1.3                                                                                                   |
| `React`       | 18.3                                                                                                    |

**Stable Jhipster version was not published and old versions could not work with spring boot 3.***

### JDL file (jhipster-jdl.jdl)
```
entity Task {
title String
description String
language Language
}

entity Employee {
firstName String
lastName String
email String
phoneNumber String
}

enum Language {
ENGLISH, TURKISH
}

relationship OneToMany {
Employee to Task{employee}
}

use mapstruct, serviceClass, serviceImpl, pagination for Task, Emplyee
```
