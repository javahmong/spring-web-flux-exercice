# spring-web-flux-exercice

This project is an exercice where the the aim is to implement the following point:
- **an endpoint to get all the products => GET /products**
- **an endpoint to save a product => POST /products**

This project use the following librairy:
- spring boot 2.6.1
- lombok 1.18.20
- spring boot data r2dbc
- spring boot webflux
- mapstruct 1.4.2.Final

About the database, it uses the H2, you do not need to create a database and insert data. When application will start, everything will be created

**Requirement to be able to do this exercice:**
- clone the project and create a branch with your trigram. Exemple: Mr John Detail => JDE-spring-web-flux-exercice will be the branch name. Do not forget to push your branches
- Maven
- Git
- Developpment IDE
- Java 11
- Rest client (Postman...)


**Good Luck!**


# Excepcted results

- When I call http://localhost:8181/products with GET method, I get a response 200 OK and a JSON like:
```sh
[
    {
        "idCompany": "1",
        "code": "P1",
        "name": "Product1",
        "price": 10.0,
        "creationDate": "2021-12-09T15:22:07.751341",
        "company": {
            "code": "COMP1",
            "name": "Company1",
            "creationDate": "2021-12-09T15:22:07.742178"
        }
    }
]
```
- When I call http://localhost:8181/products with POST method with JSON like:
```sh
{
    "code": "P4",
    "name": "Product4",
    "price": 10.0,
    "creationDate": "2021-12-09T15:22:07.751341",
    "company": {
        "code": "COMP1"
    }
}
```

I get a response 200 OK and a JSON like:
```sh
{
    "idCompany": "1",
    "code": "P4",
    "name": "Product4",
    "price": 10.0,
    "creationDate": "2021-12-09T15:22:07.751341",
    "company": {
        "code": "COMP1",
        "name": "Company1",
        "creationDate": "2021-12-09T16:24:44.547811"
    }
}
```

